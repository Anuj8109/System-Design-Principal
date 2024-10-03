package SystemDesign.Adapter.Square;

import SystemDesign.Adapter.Round.RoundPeg;

public class SquarePeg{
    private int length;

    public SquarePeg(){
    }

    public SquarePeg(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public int getSquare(){
        return length*length;
    }
}
