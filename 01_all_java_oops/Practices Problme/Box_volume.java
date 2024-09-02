/*
 * Create a class called Box that include three pieces of information as instant variable height, width, and depth(type double)
 * of two boxes.
   you class should have a constructor and initializes the three instance variable.provide a method displayVol that display
   the value of two boxes.

   suppose the values of instance variable for the first box's are(10, 10, 10) and second box's are (20, 30 , 10).

   * write a text application named Box_volume that demonstrate class Box\s capabilities.
 */

class Box {
    double height, width, depth;

    // Constructor this initialize the instant variable
    Box(double height, double width, double depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // display or access the value of instant variable.
    public void displayVol()
    {
        double volume = height * width * depth;
        System.out.println("Box Volume is: " + volume);
    }
}

public class Box_volume {
    public static void main(String[] args) {
        // Create first object name box1
        Box box1 = new Box(10, 10, 10);

        // Create first object name box2
        Box box2 = new Box(20, 30, 10);
        
        // Access the  first object value 
        box1.displayVol();

        // Access the  second object value 
        box2.displayVol();



        System.out.println("\n\n");
        
    }
    
}
