package Iterator.iterators;

import Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile next();
    void reset();
}
