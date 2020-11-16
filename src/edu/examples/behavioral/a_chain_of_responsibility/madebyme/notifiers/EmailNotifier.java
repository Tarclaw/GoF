package edu.examples.behavioral.a_chain_of_responsibility.madebyme.notifiers;

public class EmailNotifier extends Notifier {
    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        if (emergencyLevel.equals(Priority.IMPORTANT) || emergencyLevel.equals(Priority.ASAP)) {
            System.out.println("Send email: u better read report it seems we in trouble");
            return notifyNext(emergencyLevel);
        }
        return false;
    }
}
