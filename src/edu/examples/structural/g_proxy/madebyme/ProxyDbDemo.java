package edu.examples.structural.g_proxy.madebyme;

public class ProxyDbDemo {

    private static String query = "select from credit_cards_info cci, cci.cc_number, cci.cc_expiration_date, cci.cc_cvv, cci.cc_pin";

    public static void main(String[] args) {
        QueryExecutor nonAdminProxy = new DatabaseProxyImpl("John", "wrong_pass");
        nonAdminProxy.executeQuery(query);

        QueryExecutor adminProxy = new DatabaseProxyImpl("admin", "123456");
        adminProxy.executeQuery(query);
    }
}
