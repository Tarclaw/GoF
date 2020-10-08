package edu.examples.behavioral.g_state;

import edu.examples.behavioral.g_state.ui.Player;
import edu.examples.behavioral.g_state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
