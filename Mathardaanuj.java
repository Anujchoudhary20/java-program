package javaclass;
import java.util.*;
public class Mathardaanuj {
	public static void main(String[] args) {
		System.out.println("Area of circle");
		System.out.print("Enter the number wich you find a Area of Circle :- ");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		
		double s= anuj(r);
		System.out.println("Area of the circle: " +s);
	System.out.println("Thanks For watching ");

	
	
	
	
	
	}
		public static double anuj(double r) {
			double Area = (r*r)*3.1416;
			return Area;
			
		
		
		
	}
	
}
