package javaclass;
//Importing Scanner class to take input from the user
import java.util.Scanner;

public class AreaOfCircle {
 public static double calculateArea(double radius) {
     double area = Math.PI * radius * radius;
     return area;
 }

 // Main method
 public static void main(String[] args) {
     // Creating Scanner object to take input from user
     Scanner input = new Scanner(System.in);

  
     System.out.println("Enter the radius of the circle:");
     
     double radius = input.nextDouble();

   
     double area = calculateArea(radius);

     System.out.println("The area of the circle with radius " + radius + " is: " + area);
     
     System.out.println("       Thanks For watching ");

    
   }
}

 