package edu.examples.behavioral.f_observer.madebyme;

import java.util.List;

public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + " \nhere we have some vacancies for u:\n " + vacancies +
                " \n======================================================================\n ");

    }
}
