package behavioral.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

// Concrete Collection
public class  BookCollectionImpl implements BookCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public IteratorCustom createIterator() {
        return new BookIterator(books);
    }
}