package behavioral.visitor;

import behavioral.visitor.elements.Book;
import behavioral.visitor.elements.Fruit;

public interface ShoppingCartVisitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
