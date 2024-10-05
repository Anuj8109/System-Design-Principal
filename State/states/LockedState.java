package State.states;

import State.ui.Player;

public class LockedState extends State{

    public LockedState(Player player){
        super(player);
    }

    @Override
    public String onLock() {
        if(player.isPlaying()){
            player.setState(new ReadyState(player));
            return "Stop playing";
        }else{
            return "Locked..";
        }
    }

    @Override
    String onPlay() {
        player.setState(new ReadyState(player));
        return "Ready";
    }

    @Override
    String onNext() {
        return "Locked..";
    }

    @Override
    String onPrevious() {
        return "Locked..";
    }
    
}
