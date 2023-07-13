import java.util.Scanner;

public class frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String name = sc.nextLine().toLowerCase();
        int freq[] = new int[122];
        for (int i = 0; i < name.length(); i++)
            freq[(int) name.charAt(i)]++;

        for (int i = 0; i < 122; i++) {
            if (freq[i] != 0 && (char) i != ' ')
                System.out.println((char) i + " --> " + freq[i]);
        }
        sc.close();
    }
}
