import java.util.*;

class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter the Value: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        if (value % 2 != 0)
            System.out.println(value + " is ODD");
        else
            System.out.println(value + " is EVEN");
    }
}