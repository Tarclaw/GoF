package edu.examples.behavioral.c_iterator.social_networks;

import edu.examples.behavioral.c_iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
