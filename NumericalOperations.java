public class NumericalOperations {
public static void main (String args[]) {

int N = 1234;
int a = N % 10;
int n1 = N/10;
int b = n1 % 10;
int n2 = n1/10;
int c = n2 % 10;
int n3 = n2/10;
int d = n3 % 10;

int fin = 1000 * a + 100 * b + 10 * c + d;
System.out.println("Initial number = " + N);
System.out.println(fin);
}
}
