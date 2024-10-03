package SystemDesign.Adapter.Round;

public class RoundHole {
    
    private int radius;
    public RoundHole(){        
    }
    
    public RoundHole(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg peg){
        return this.radius >= peg.getRadius();
    }
}
