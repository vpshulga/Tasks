package by.vpshulga.lesson24.task06;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try {
            Test.insert(Connection.TRANSACTION_READ_UNCOMMITTED, true);   //54s.
            Test.insert(Connection.TRANSACTION_REPEATABLE_READ, true);   //82s.
            Test.insert(Connection.TRANSACTION_READ_UNCOMMITTED, false);   //314ms.
            Test.insert(Connection.TRANSACTION_REPEATABLE_READ, false);   //345ms.

            Test.insertWithBatch(Connection.TRANSACTION_READ_UNCOMMITTED, true); //51s.
            Test.insertWithBatch(Connection.TRANSACTION_REPEATABLE_READ, true); //72s.
            Test.insertWithBatch(Connection.TRANSACTION_READ_UNCOMMITTED, false); //435ms.
            Test.insertWithBatch(Connection.TRANSACTION_REPEATABLE_READ, false); //486ms.

            Test.insertTenThreads(Connection.TRANSACTION_READ_UNCOMMITTED, true); //11825ms.
            Test.insertTenThreads(Connection.TRANSACTION_REPEATABLE_READ, true); //12523ms.
            Test.insertTenThreads(Connection.TRANSACTION_READ_UNCOMMITTED, false); //740ms.
            Test.insertTenThreads(Connection.TRANSACTION_REPEATABLE_READ, false); //815ms.

            Test.clearTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
