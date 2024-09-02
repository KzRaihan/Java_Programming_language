/*
  write an inheritance hierarchy for classes Rectangle, circle, Triangle
  Create an abstract class named Shape as Super-class of the hierarchy.
  Write an application that instantiates object of your classes and output the their areas.
 */
abstract class Shape {
  // abstract method
  abstract void cal_area();

  // fields
  double val1, val2;

  // constructor
  Shape(double val1, double val2) {
    this.val1 = val1;
    this.val2 = val2;
  }

  // non-abstract method
  void display() {
    System.out.println("Val1 is: " + val1);
    System.out.println("Val2 is: " + val2);
  }

}

class Rectangle extends Shape {
  // constructor
  Rectangle(double val1, double val2) {
    super(val1, val2);
  }

  // abstract class
  @Override
  void cal_area() {
    double ans = val1 * val2;                 // Area = Length × Width
    System.out.println("Area of Rectangle: " + ans);
  }
}

class Circle extends Shape {
  // constructor
  Circle(double val1) {
    super(val1, val1); 
  }

  // abstract class
  @Override
  void cal_area() {
    double ans = Math.PI * Math.pow(val1, 2);  // Area= π × Radius^2   or = 3.1416 * val1 * val1
    System.out.println("Area of Circle: " + ans);
  }

}

class Triangle extends Shape {
  // constructor
  Triangle(double val1, double val2) {
    super(val1, val2);
  }
  // abstract class
  @Override
  void cal_area() {
    double ans = (val1 * val2) * 0.5;   // Area = (Base × Height) * 0.5
    System.out.println("Area of Triangle: " + ans);
  }
}




public class Rec_cir_tri {
  public static void main(String[] args) {
    // create a super class reference variable (We can't create Shape(abstract) class object)
    Shape shape;
    shape = new Rectangle(10.40, 40.44);
    shape.display();

    // calculation the Rectangle area
    shape.cal_area();
    System.out.println();

    // calculation the Circle area
    shape = new Circle(10.50);
    shape.display();
    shape.cal_area();
    System.out.println();

    // calculation the Triangle area
    shape = new Triangle(10.60, 30.55);
    shape.display();
    shape.cal_area();
    System.out.println();
        
    }
}
