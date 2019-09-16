import java.util.Scanner;
import java.lang.*; 
public class RandomNumbers {
public static void main (String args[]) {

	Scanner scan = new Scanner(System.in);
	
System.out.println("Enter a negative number:");
int d1 = scan.nextInt();
int d2 = d1 * -1;

System.out.println("Enter a number greater than " + d2 + ":");
int d3 = scan.nextInt();

int range = d2 - d1;

double r1 = Math.random() * range + d1;
double r2 = Math.random() * range + d1;


System.out.println("You rolled a " + Math.round(r1) + " and a " + Math.round(r2));
}
}
