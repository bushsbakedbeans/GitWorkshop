import java.util.Scanner;

public class UserInput {
public static void main (String args[]) {

Scanner scan = new Scanner(System.in);

System.out.println("Enter a noun");
String noun = scan.nextLine();
System.out.println("Enter a verb in past tense");
String verb = scan.nextLine();
System.out.println("Enter a whole number");
int num = scan.nextInt();
System.out.println("Enter another whole number");
int num2 = scan.nextInt();

System.out.println("One day you were crossing a bridge when a " + noun + " under the bridge asked for two numbers. \"" + num + " and " + num2 + "!\" You replied. It then asked for the product of those 2 numbers. \"" + num*num2 + "!\" was your answer. The " + noun + " " + verb + " in defeat and you got over the bridge safely.");


}
}
