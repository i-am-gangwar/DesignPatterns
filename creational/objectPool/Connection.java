package creational.objectPool;


public class Connection {
    private static int counter = 0;
    private int id;

    public Connection() {
        this.id = ++counter;
        System.out.println("Creating Connection " + id);
    }

    public void connect() {
        System.out.println("Using Connection " + id);
    }
}

