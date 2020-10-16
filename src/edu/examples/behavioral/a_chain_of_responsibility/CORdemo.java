package edu.examples.behavioral.a_chain_of_responsibility;

import edu.examples.behavioral.a_chain_of_responsibility.middleware.Middleware;
import edu.examples.behavioral.a_chain_of_responsibility.middleware.RoleCheckMiddleware;
import edu.examples.behavioral.a_chain_of_responsibility.middleware.ThrottlingMiddleware;
import edu.examples.behavioral.a_chain_of_responsibility.middleware.UserExistsMiddleware;
import edu.examples.behavioral.a_chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Here are some examples of the pattern in core Java libraries: *
 *     javax.servlet.Filter#doFilter()
 *     java.util.logging.Logger#log() *
 * Identification: The pattern is recognizable by behavioral methods of one group of objects that indirectly call
 * the same methods in other objects, while all the objects follow the common interface.
 */
public class CORdemo {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                  .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
