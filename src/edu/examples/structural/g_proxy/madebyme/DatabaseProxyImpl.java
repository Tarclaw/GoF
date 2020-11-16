package edu.examples.structural.g_proxy.madebyme;

public class DatabaseProxyImpl implements QueryExecutor {

    private boolean isAdmin;
    private DatabaseImpl realDB;

    private final String username;
    private final String password;

    public DatabaseProxyImpl(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean activateAdmin() {
        return this.username.equals("admin") && this.password.equals("123456");
    }

    @Override
    public void executeQuery(String query) {
        this.isAdmin = activateAdmin();
        if (isAdmin) {
            realDB = new DatabaseImpl();
            realDB.executeQuery(query);
        } else {
            System.out.println("Sorry u are not authorized.");
        }
    }
}
