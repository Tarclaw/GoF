package edu.examples.behavioral.d_mediator.components;

import edu.examples.behavioral.d_mediator.mediators.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
