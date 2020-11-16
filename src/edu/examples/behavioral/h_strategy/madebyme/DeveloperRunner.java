package edu.examples.behavioral.h_strategy.madebyme;

public class DeveloperRunner {
    public static void main(String[] args) {

        Develolper develolper = new Develolper();

        develolper.setActivity(new Sleeping());
        develolper.executeActivity();

        develolper.setActivity(new Training());
        develolper.executeActivity();

        develolper.setActivity(new Coding());
        develolper.executeActivity();

        develolper.setActivity(new Reading());
        develolper.executeActivity();

    }
}
