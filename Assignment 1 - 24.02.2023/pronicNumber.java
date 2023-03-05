import java.util.Scanner;

public class pronicNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, flag = 0;
        System.out.println("Enter a nubmer to check if it is a pronic Number or not:-\n");
        x = inp.nextInt();
        for (int i = 1; i < x / 2; i++) {
            if (x % i == 0) {
                if (i * (i + 1) == x) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 1)
            System.out.println("Entered number " + x + " is a pronic number");
        else
            System.out.println("Entered number " + x + " is NOT a pronic number");

    }
}
