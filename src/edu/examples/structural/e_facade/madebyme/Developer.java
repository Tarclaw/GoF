package edu.examples.structural.e_facade.madebyme;

public class Developer {

    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems... ");
        } else {
            System.out.println("Developer is reading about new technologies");
        }
    }

}
