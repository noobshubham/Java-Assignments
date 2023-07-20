import java.util.Scanner;

class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean flag = false;
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not a Palindrom!");
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("A Palindrom!");
        sc.close();
    }
}