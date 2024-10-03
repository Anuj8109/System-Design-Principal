package SystemDesign.Iterator.iterators;

import SystemDesign.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile next();
    void reset();
}
