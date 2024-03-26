package javaclass;
import java.util.Scanner;

public class Maximam3number {
public static void main(String[] args) {
	System.out.println("Which Number are Maximam ");
	System.out.print("Enter fest Number :- ");
	Scanner p = new Scanner(System.in);

	System.out.print("Enter a Secand Number :- ");
	int s = p.nextInt();
	System.out.print("Enter a Thard Number :- ");
	int t = p.nextInt();
if(f>s && f>t) {
	System.out.println(f+" is Maximam ");
}
else if(s>f && s>t) {
	System.out.println(s+" is Maximam ");
}
else 
	System.out.println(t+" is Maximam ");
}
}
