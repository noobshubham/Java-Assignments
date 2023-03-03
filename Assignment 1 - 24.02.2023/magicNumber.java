import java.util.Scanner;

public class magicNumber {
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, remSum = 0;
        System.out.println("Enter a number to check whether a number is a magic number or not:-\n");
        x = inp.nextInt();
        int temp = x;
        int unidigit = digitSum(x);
        while (unidigit >= 10)
            unidigit = digitSum(unidigit);
        if (unidigit == 1)
            System.out.println("Entered number " + temp + " is a magic number.");
        else
            System.out.println("Entered number " + temp + " is NOT a magic number.");
    }
}
