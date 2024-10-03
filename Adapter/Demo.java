package SystemDesign.Adapter;

import SystemDesign.Adapter.Adapters.SquarePegAdapter;
import SystemDesign.Adapter.Round.RoundHole;
import SystemDesign.Adapter.Round.RoundPeg;
import SystemDesign.Adapter.Square.SquarePeg;

public class Demo {
    
    public static void main(String[] args){

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(10);

        SquarePegAdapter smallSquarePegAdapter  = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSquarePegAdapter  = new SquarePegAdapter(largeSqPeg);


        if(roundHole.fits(smallSquarePegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!roundHole.fits(largeSquarePegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
