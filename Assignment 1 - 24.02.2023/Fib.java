import java.util.Scanner;

public class Fib {
    public static int ser(int n) {
        if (n == 0 || n == 1)
            return n;
        return ser(n - 1) + ser(n - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number till which the fibonnaci series should run:-\n");
        int a = inp.nextInt();
        for (int i = 0; i <= a; i++) {
            System.out.print(ser(i) + " ");
        }

    }
}
