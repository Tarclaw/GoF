package edu.examples.behavioral.h_strategy.madebyme;

public class Develolper {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
