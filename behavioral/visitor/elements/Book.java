package behavioral.visitor.elements;

import behavioral.visitor.ShoppingCartVisitor;

// Concrete Elements
public class Book implements ItemElement {
    private int price;
    private String isbn;

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice() { return price; }
    public String getIsbn() { return isbn; }

    @Override
    public void accept(ShoppingCartVisitor visitor) {
        visitor.visit(this);
    }
}
