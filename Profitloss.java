package javaclass;
import java.util.Scanner;

public class Profitloss {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first number:");
		 int cp = sc.nextInt();
		 System.out.println("Enter Secand  number:");
		 int sp = sc.nextInt();
		if(sp==cp) {
			System.out.print("You have no profit and Loss");}
		
		else { if (sp>=cp) {
			System.out.print("You have profit in RS :- " +(sp-cp));
	
		}
		else
			System.out.print("You have loss in RS :- " +(sp-cp));	
		
		}
	}

}
