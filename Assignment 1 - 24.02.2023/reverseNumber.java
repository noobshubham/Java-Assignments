import java.util.Scanner;

public class reverseNumber {
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
        System.out.println("Reverse of entered number " + temp + " is = " + rev);
    }
}
