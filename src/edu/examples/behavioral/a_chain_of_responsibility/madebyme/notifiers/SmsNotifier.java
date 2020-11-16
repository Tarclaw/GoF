package edu.examples.behavioral.a_chain_of_responsibility.madebyme.notifiers;

public class SmsNotifier extends Notifier {
    @Override
    public boolean notifySomebody(Priority emergencyLevel) {
        if (emergencyLevel.equals(Priority.ASAP)) {
            System.out.println("Send SMS: code red, code red, GO office ASAP !!!! ");
            orderRedBullAndCoffee();
            return notifyNext(emergencyLevel);
        }
        return false;
    }

    private void orderRedBullAndCoffee() {
        System.out.println("Red Bull and Coffee will be delivered soon.");
    }
}
