package behavioral.iteratorPattern;

import java.util.List;

// Concrete Iterator
public class BookIterator implements IteratorCustom {
    private List<Book> books;
    private int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        return books.get(position++);
    }
}
