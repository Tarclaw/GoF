package edu.examples.behavioral.g_state.madebyme;

public class DeveloperDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Develolper develolper = new Develolper();
        develolper.setActivity(activity);

        for (int i = 0; i<10; i++) {
            develolper.performActivity();
            develolper.changeActivity();
        }

        System.out.println("Fuck thus, go vacation.");
    }
}
