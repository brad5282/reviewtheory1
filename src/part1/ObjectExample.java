
package part1;

import TurtleGraphics.*;


public class ObjectExample {

    
    public static void main(String[] args) {
        Pen p1 = new StandardPen();
        /* mulii-line comment
        Objects are created from a CLASS
        p1 is an INSTANCE (Object) of the Pen class
        Instantiating an object = makig an object
        */
        p1.move(25);
        p1.move(-30,50);
        /*
        p1. -> brings up a list of methods that p1 has
        Some methods are found directly in pen
        Others are INHEIRITED from the "Class of all classes" _> Object
        //ex: toString, hashCode, compareTo
        */
        SketchPadWindow w = new SketchPadWindow(500,500);
        WigglePen wp = new WigglePen(w);
        RainbowPen rp = new RainbowPen(w);
        
        wp.move(200);
        rp.setDirection(145);
        rp.move(100);
        
        /*
        even though wp and rp are different types of pens They respond to the same commands as p1 has the same commands ass p1
        Since all 3pens have the "Pen" class are their parent Pen is where most of the pens inheirit
        */
        
        /*it is common to have more than one way to make an object 
        can make a pen with a default window or with a custom window
        */
        
    }
    
}
