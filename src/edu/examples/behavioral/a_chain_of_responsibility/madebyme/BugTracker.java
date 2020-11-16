package edu.examples.behavioral.a_chain_of_responsibility.madebyme;

import edu.examples.behavioral.a_chain_of_responsibility.madebyme.notifiers.*;

public class BugTracker {

    public static void main(String[] args) {
        Notifier notifier = new SimpleReportNotifier();
        notifier.linkWith(new EmailNotifier())
                .linkWith(new SmsNotifier());
        notifier.notifySomebody(Priority.ASAP);
    }
}
