package creational.objectPool;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static ConnectionPool instance;
    private final int MAX_POOL_SIZE = 3;
    private List<Connection> available = new ArrayList<>();
    private List<Connection> inUse = new ArrayList<>();

    private ConnectionPool() {
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            available.add(new Connection());
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public synchronized Connection acquire() {
        if (available.isEmpty()) {
            throw new RuntimeException("No available connections!");
        }
        Connection conn = available.remove(0);
        inUse.add(conn);
        return conn;
    }

    public synchronized void release(Connection conn) {
        inUse.remove(conn);
        available.add(conn);
    }
}
