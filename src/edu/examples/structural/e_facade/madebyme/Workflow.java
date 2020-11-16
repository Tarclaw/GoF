package edu.examples.structural.e_facade.madebyme;

public class Workflow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void letsRoll() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }

}
