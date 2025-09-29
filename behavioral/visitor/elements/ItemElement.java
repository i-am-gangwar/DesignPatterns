package behavioral.visitor.elements;

import behavioral.visitor.ShoppingCartVisitor;

public interface ItemElement {
    void accept(ShoppingCartVisitor visitor);
}
