package exercises;

public enum Direction {
    // NORTH, SOUTH, EAST and WEST are all references! They are references to the
    // only Direction objects that can exist.
    NORTH("in a northerly direction..."), 
    SOUTH ("in a southerly direction..."), 
    EAST ("in a eastherly direction..."), 
    WEST ("in a westherly direction...");
    
    String direction;// instance var; package or private is ok
    
    Direction(String direction){// package or private is ok
        
        this.direction = direction;
    }
    
    @Override
    public String toString(){
        return "We are travelling: " + direction;
    }
    
}
