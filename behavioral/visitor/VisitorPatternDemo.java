package behavioral.visitor;

import behavioral.visitor.elements.Book;
import behavioral.visitor.elements.Fruit;
import behavioral.visitor.elements.ItemElement;

// Client
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(60, "1234"),
                new Book(40, "5678"),
                new Fruit(10, 2, "Apple"),
                new Fruit(5, 5, "Banana")
        };

        ShoppingCartVisitor costVisitor = new ShoppingCartCostVisitor();
        for (ItemElement item : items) {
            item.accept(costVisitor);
        }
    }
}

