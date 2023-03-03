import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, arm = 0;
        System.out.println("Enter a number to check if it's an armstrong number or not:-\n");
        x = inp.nextInt();
        int temp = x;
        while (x > 0) {
            int rem = x % 10;
            int digit = rem * rem * rem;
            arm += digit;
            x /= 10;
        }
        if (arm == temp)
            System.out.println("Entered number is an armstrong number");
        else
            System.out.println("Entered number is NOT an armstrong number");
    }
}
