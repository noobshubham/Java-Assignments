import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, sum = 0;
        System.out.println("Enter a number to check if its a perfect number or not:-\n");
        x = inp.nextInt();
        for (int i = 1; i < x; i++) {
            if (x % i == 0)
                sum += i;
        }
        if (sum == x)
            System.out.println("Entered number " + x + " is a perfect number");
        else
            System.out.println("Entered number " + x + " is NOT a perfect number");
    }
}
