package Iterator.SocialNetworks;

import Iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator  createFriendsIterator(String profileEmial);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
