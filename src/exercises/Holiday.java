package exercises;

import static exercises.Direction.NORTH;

public class Holiday {
    
    public static void main(String[] args) {
       
        goSomewhere(Direction.NORTH);
        goSomewhere(Direction.EAST);
        goSomewhere(Direction.SOUTH);
        goSomewhere(Direction.WEST);
        
        // instantiate an enum type
        //Direction d = new Direction("North");// compiler error
        Direction sth = Direction.SOUTH;
        System.out.println(sth);
        
          // use the static import
         goSomewhere(NORTH);  
    }
    
    public static void goSomewhere(Direction d){
    
        System.out.println(d);
   }
}
