import java.util.Scanner;

public class happyNumber {
    private static int digiSqaure(int x) {
        int digitSquares = 0;
        while (x > 0) {
            int rem = x % 10;
            digitSquares += (rem * rem);
            x /= 10;
        }
        return digitSquares;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x;
        System.out.println("Enter a number to check if its a happy number or not:-\n");
        x = inp.nextInt();
        int temp = x;
        int lds = digiSqaure(x);
        while (true) {
            lds = digiSqaure(lds);
            if (lds == 1 || lds < 10)
                break;
        }
        if (lds == 1)
            System.out.println("Entered number " + temp + " is a Happy Number.");
        else
            System.out.println("Entered number " + temp + " is NOT a Happy Number.");
    }
}
