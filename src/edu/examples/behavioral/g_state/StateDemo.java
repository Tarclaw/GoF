package edu.examples.behavioral.g_state;

import edu.examples.behavioral.g_state.ui.Player;
import edu.examples.behavioral.g_state.ui.UI;

/**
 * Examples from real world:
 * javax.faces.lifecycle.LifeCycle#execute() (controlled by the FacesServlet: behavior is dependent on current phase (state) of JSF lifecycle)
 */
public class StateDemo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
