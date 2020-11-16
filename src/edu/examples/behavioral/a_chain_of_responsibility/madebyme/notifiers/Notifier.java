package edu.examples.behavioral.a_chain_of_responsibility.madebyme.notifiers;

public abstract class Notifier {

    private Notifier next;

    public Notifier linkWith(Notifier next) {
        this.next = next;
        return next;
    }

    public abstract boolean notifySomebody(Priority emergencyLevel);

    protected boolean notifyNext(Priority emergencyLevel) {
        if (next == null) {
            return true;
        }
        return next.notifySomebody(emergencyLevel);
    }
}
