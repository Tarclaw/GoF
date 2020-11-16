package edu.examples.structural.g_proxy.madebyme;

public class DatabaseImpl implements QueryExecutor {



    @Override
    public void executeQuery(String query) {
        System.out.println("Admin executed query: "+ query);
    }
}
