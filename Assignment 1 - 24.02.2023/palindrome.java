import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, rev = 0;
        System.out.println("Enter a number to check if its a palindrome number or not:-\n");
        x = inp.nextInt();
        int temp = x;
        while (x > 0) {
            int rem = x % 10;
            rev = (rev * 10) + rem;
            x /= 10;
        }
        if (rev == temp)
            System.out.println("Entered number " + temp + " is a palindrome number.");
        else
            System.out.println("Entered number " + temp + " is NOT a palindrome number.");
    }
}
