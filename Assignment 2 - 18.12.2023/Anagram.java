import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two String to Check for Anagram!");

        String sOne = sc.nextLine();
        String sTwo = sc.nextLine();

        if (sOne.length() != sTwo.length())
            System.out.println("not an Anagram!");
        else {
            char[] cOne = sOne.toCharArray();
            char[] cTwo = sTwo.toCharArray();

            Arrays.sort(cOne);
            Arrays.sort(cTwo);

            if (Arrays.equals(cOne, cTwo))
                System.out.println("an Anagram!");
            else
                System.out.println("not an Anagram!");
        }
        sc.close();
    }
}
