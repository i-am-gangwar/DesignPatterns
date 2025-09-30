package creational.objectPool;

public class ObjectPoolDemo {
    public static void main(String[] args) {
//        ConnectionPool pool = new ConnectionPool();
//        Connection c1 = pool.acquire();
//        c1.connect();
//        Connection c2 = pool.acquire();
//        c2.connect();
//        Connection c3 = pool.acquire();
//        c3.connect();
//        pool.release();

        // problem can create multiple instance so use singleton pattern
        ConnectionPool pool1 =  ConnectionPool.getInstance();
        ConnectionPool pool2 =  ConnectionPool.getInstance();

        Connection c1 = pool1.acquire(); // From pool1
        Connection c2 = pool2.acquire(); // From pool2

        c1.connect();
        c2.connect();
    }
}