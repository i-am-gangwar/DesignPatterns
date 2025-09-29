package behavioral.iteratorPattern;

// Client Code
public class WithIteratorDemo {
    public static void main(String[] args) {
        BookCollection collection = new BookCollectionImpl();
        ((BookCollectionImpl) collection).addBook(new Book("Design Patterns"));
        ((BookCollectionImpl) collection).addBook(new Book("Clean Code"));
        ((BookCollectionImpl) collection).addBook(new Book("Effective Java"));

        // Client does not care about internal representation
        IteratorCustom iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Book: " + book.getName());
        }
    }
}
