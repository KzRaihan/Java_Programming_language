/*
 * Topic: Encapsulation in java
 * obj  : Fundamental concept in oop that manipulate data and methods in single unit.
 

 * > Benefit:
 *     -> Provides data hiding.
 *     -> Reusability
 *     -> Maintainability
 *     -> Improved security    
 * 
 * 
 * > Encapsulation process:
 *    -> 1. Packing variables(fields) and methods into a single unit
 *    -> 2. Protecting data by declaring them as private
 */


 // 1. packing variable and method into a single unit
 public class intro {
     String name;
     int age; // <- this are the members of default access modifier

     void display() {
         System.out.println("Name: " + name);
         System.out.println("Age : " + age);
     }

 }


