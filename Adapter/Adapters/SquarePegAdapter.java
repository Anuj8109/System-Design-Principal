package Adapter.Adapters;

import Adapter.Round.RoundPeg;
import Adapter.Square.SquarePeg;

public class SquarePegAdapter extends RoundPeg{
    SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg){
        this.peg = squarePeg;
    }

    public SquarePegAdapter(int length){
        peg = new SquarePeg(length);
    }

    @Override
    public int getRadius(){
        Double d = ((Double)(peg.getLength() * Math.sqrt(2))/2);
        return d.intValue();
    }
}
