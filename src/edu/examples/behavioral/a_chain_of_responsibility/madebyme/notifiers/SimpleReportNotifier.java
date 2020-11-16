package edu.examples.behavioral.a_chain_of_responsibility.madebyme.notifiers;

public class SimpleReportNotifier extends Notifier {
    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        System.out.println("Create report using logs with emergencyLevel: " + emergencyLevel.name() + " u can read it whenever u want");

        return notifyNext(emergencyLevel);
    }
}
