package edu.examples.behavioral.f_observer.madebyme;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
