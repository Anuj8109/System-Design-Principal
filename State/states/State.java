package State.states;

import State.ui.Player;

public abstract class State {
    public Player player;

    State(Player player){
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
