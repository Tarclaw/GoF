package edu.examples.structural.e_facade.madebyme;

public class SprintRunner {
    /*public static void main(String[] args) {
        Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();

        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }*/

    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.letsRoll();
    }
}
