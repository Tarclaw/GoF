package edu.examples.behavioral.f_observer.madebyme;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
