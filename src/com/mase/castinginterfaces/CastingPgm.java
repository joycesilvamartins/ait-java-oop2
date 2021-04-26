package com.mase.castinginterfaces;

public class CastingPgm {
    
    public static void upCasting() {
        //a
        Triangle t = new RightAngledTriangle();
        t.draw();//output - RightAngledTriangle::draw 
        //b
        Triangle t1 = new Triangle();
        RightAngledTriangle r1 = new RightAngledTriangle();
        t1.draw();//output - Triangle::draw
        r1.draw();//output - RightAngledTriangle::draw
        t1 = r1;
        t1.draw();//output - RightAngledTriangle::draw
        //c
        Shape s = new Triangle();
        s.draw();// output - Triangle::draw
        s = r1;
        s.draw();//output - RightAngledTriangle::draw
        
        progToTheInterface(new Triangle());
        progToTheInterface(new RightAngledTriangle());
        
    }
    
    public static void downCasting() {
        //a
        Triangle t = new Triangle();
        t.draw();//output - Triangle::draw
        //b
        RightAngledTriangle r = new RightAngledTriangle();
        r.draw();//output - RightAngledTriangle::draw
        //c
        t = r;//upcasting
        //d
        t.draw();//output - RightAngledTriangle::draw
        //e
        //t.area();//Triangle has no area()
        //f
        Triangle t1 = new Triangle();
        //g
        RightAngledTriangle r1 = new RightAngledTriangle();
        //h
        // r1 = t1;//won't compile
        //r1 = (RightAngledTriangle) t1;  // downcast, ClassCastException
        // at runtime because r1 will
        // refer to a Triangle object
        // i.e. up the tree, not allowed
        //i
        Triangle t2 = new RightAngledTriangle();
        //j
        RightAngledTriangle r2 = (RightAngledTriangle) new Triangle();
        //k
        Triangle t5 = new RightAngledTriangle();
        t5.draw();
        RightAngledTriangle r5 = (RightAngledTriangle) t5;
        r5.area();
        //t5.area();
        //l
        Triangle t6 = new Triangle();
        t6.draw();
        RightAngledTriangle r6 = (RightAngledTriangle) t6;//ClassCastException
        r6.area();

        //instanceof
        Triangle t7 = new Triangle();
        if (t7 instanceof RightAngledTriangle) {
            System.out.println("here");
            RightAngledTriangle r7 = (RightAngledTriangle) t7;
        }
        
    }
    
    public static void progToTheInterface(Shape s) {
        
        s.draw();
        
    }
    
    public static void main(String[] args) {

        upCasting();
        //downCasting();
        
    }
}
