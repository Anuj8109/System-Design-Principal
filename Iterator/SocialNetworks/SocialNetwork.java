package SystemDesign.Iterator.SocialNetworks;

import SystemDesign.Iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator  createFriendsIterator(String profileEmial);

    ProfileIterator createCoworkersIterator(String profileEmail);
}