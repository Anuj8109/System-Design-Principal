package Iterator.spammer;

import Iterator.SocialNetworks.SocialNetwork;
import Iterator.iterators.ProfileIterator;
import Iterator.profile.Profile;

public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network){
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message){
        System.out.println("\nIterating over friends...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while(iterator.hasNext()){
            Profile profile = iterator.next();
            sendMessage(profile.getEmail(), message);
        }
    }
    
    public void sendSpamToCoworkers(String profileEmail, String message){
        System.out.println("\nIterating over Coworkers...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while(iterator.hasNext()){
            Profile profile = iterator.next();
            sendMessage(profile.getEmail(), message);
        }
    }
    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
