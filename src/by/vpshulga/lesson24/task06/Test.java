package by.vpshulga.lesson24.task06;

import by.vpshulga.lesson24.db.ConnectorManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Test {
    private static final String saveQuery = "INSERT INTO test (value, value1, value2) VALUES (?, ?, ?)";
    private static final String clearTableQuery = "DELETE FROM test";
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();


    static void insert(int level, boolean autoCommit) throws SQLException {
        Connection connection = ConnectorManager.getConnection();
        connection.setAutoCommit(autoCommit);
        connection.setTransactionIsolation(level);
        PreparedStatement psSave = connection.prepareStatement(saveQuery);
        psSave.setString(1, "a");
        psSave.setInt(2, 1);
        psSave.setString(3, "b");
        if (connection.getAutoCommit()) {
            long start = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                psSave.executeUpdate();
            }
            long end = System.nanoTime();
            System.out.println((end - start) / 1000000000 + "s.");
        } else {
            long start = System.nanoTime();
            for (int i = 0; i < 1000; i++) {
                psSave.executeUpdate();
            }
            connection.commit();
            long end = System.nanoTime();
            System.out.println("commit:" + (end - start) / 1000000 + "ms.");
        }
    }

    static void insertTenThreads(int level, boolean autoCommit) throws SQLException, ExecutionException, InterruptedException {
        List<Thread> threads = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                threadLocal.set(ConnectorManager.getConnection());
                Connection connection = threadLocal.get();
                try {
                    connection.setTransactionIsolation(level);
                    connection.setAutoCommit(autoCommit);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                try {
                    PreparedStatement psSave = connection.prepareStatement(saveQuery);
                    psSave.setString(1, "a");
                    psSave.setInt(2, 1);
                    psSave.setString(3, "b");

                    if (connection.getAutoCommit()) {
                        for (int j = 0; j < 100; j++) {
                            try {
                                psSave.executeUpdate();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        for (int j = 0; j < 100; j++) {
                            try {
                                psSave.executeUpdate();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                        connection.commit();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            });
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.nanoTime();
        System.out.println((end - start) / 1000000 + "ms.");
    }

    static void insertWithBatch(int level, boolean autoCommit) throws SQLException {
        Connection connection = ConnectorManager.getConnection();
        connection.setAutoCommit(autoCommit);
        connection.setTransactionIsolation(level);
        PreparedStatement psSave = connection.prepareStatement(saveQuery);
        psSave.setString(1, "a");
        psSave.setInt(2, 1);
        psSave.setString(3, "b");
        if (connection.getAutoCommit()) {
            long start = System.nanoTime();
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 50; j++) {
                    psSave.addBatch();

                }
                psSave.executeBatch();
            }
            long end = System.nanoTime();
            System.out.println((end - start) / 1000000000 + "s.");
        } else {
            long start = System.nanoTime();
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 50; j++) {
                    psSave.addBatch();
                }
                psSave.executeBatch();
            }
            connection.commit();
            long end = System.nanoTime();
            System.out.println("commit:" + (end - start) / 1000000 + "ms.");
        }
    }

    static void clearTable() throws SQLException {
        Connection connection = ConnectorManager.getConnection();
        PreparedStatement psClear = connection.prepareStatement(clearTableQuery);
        psClear.executeUpdate();
    }
}
