/*
Design an abstract class Shape with an abstract method calculateArea(). Create two
concrete classes Circle and Rectangle that extend Shape. Implement the calculateArea()
method in both classes. The Circle class should have a radius field, and the Rectangle class
should have length and width fields. In the main method, create objects of Circle and
Rectangle, then calculate and print the area for both shapes.

abstract class: Shape
      field:
          >> no field
      method:
         >> abstract method calculateArea()
  
   
*/
// Abstract class: Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
}

// class: Circle
class Circle extends Shape {
    // already come: double calculateArea()

    //additional  Field: radius
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the calculateArea() method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;   // 3.1416 * radius * radius
    }
}

// class: Rectangle
class Rectangle extends Shape {
    // Fields: length and width
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the calculateArea() method for Rectangle
    @Override
    double calculateArea() {
        return length * width;     // formula: length * width
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Circle object with circle class 
        Circle circle = new Circle(8.2);
        // Calculate and print the area of the circle
        System.out.println("Area of Circle: " + circle.calculateArea());  

        // Create a Rectangle object with length 4.0 and width 6.0
        Rectangle rectangle = new Rectangle(6.0, 8.0);
        // Calculate and print the area of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
