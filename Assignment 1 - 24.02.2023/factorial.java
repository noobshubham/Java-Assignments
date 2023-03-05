import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, fact = 1;
        System.out.println("Enter a number to find out the factorial of that number:-");
        x = inp.nextInt();
        while (x != 0) {
            fact *= x--;
        }
        System.out.println("Factorial = " + fact);
    }
}
