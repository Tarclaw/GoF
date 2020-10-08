package edu.examples.behavioral.c_iterator.iterators;

import edu.examples.behavioral.c_iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
