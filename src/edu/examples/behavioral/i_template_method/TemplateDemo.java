package edu.examples.behavioral.i_template_method;

import edu.examples.behavioral.i_template_method.networks.Facebook;
import edu.examples.behavioral.i_template_method.networks.Network;
import edu.examples.behavioral.i_template_method.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Real world examples:
 * - All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.
 * - All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.
 * - javax.servlet.http.HttpServlet, all the doXXX() methods by default send a HTTP 405 “Method Not Allowed” error
 *   as a response. You’re free to override any of them.
 */
public class TemplateDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
