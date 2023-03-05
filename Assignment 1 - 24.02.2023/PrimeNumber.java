import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        System.out.println("Enter a number to check if it is a prime number or not.");
        a = inp.nextInt();
        int flag = 1;
        for (int i = 2; i <= a / 2; i++) {
            if (a / 2 % i == 0)
                flag = 0;
            break;
        }
        if (flag == 1)
            System.out.println(a + " is a prime number");
        else
            System.out.println(a + " is NOT a prime number");
    }
}
