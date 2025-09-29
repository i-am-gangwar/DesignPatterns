package behavioral.visitor;

import behavioral.visitor.elements.Book;
import behavioral.visitor.elements.Fruit;

// Concrete Visitor
public class ShoppingCartCostVisitor implements ShoppingCartVisitor {
    @Override
    public void visit(Book book) {
        int cost = book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();
        System.out.println("Book ISBN: " + book.getIsbn() + " cost = " + cost);
    }

    @Override
    public void visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " cost = " + cost);
    }
}