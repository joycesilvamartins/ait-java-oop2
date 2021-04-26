package com.example.enums.complex;

import static com.example.enums.complex.Direction.*;

public class Holiday {
    
    public static void main(String[] args) {
        goSomewhere(Direction.NORTH);
        goSomewhere(Direction.SOUTH);
        goSomewhere(Direction.EAST);
        goSomewhere(Direction.WEST);
        
        Direction sth = Direction.SOUTH;
        goSomewhere(sth);
        
        goSomewhere(NORTH);
        
    }
    
    public static void goSomewhere(Direction d) {
        System.out.println(d);
        
    }
    
}
