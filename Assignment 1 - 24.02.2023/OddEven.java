import java.util.*;

class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter the Value: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        if (value % 2 != 0)
            System.out.println("ODD");
        else
            System.out.println("EVEN");
    }
}