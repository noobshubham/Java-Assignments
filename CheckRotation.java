import java.util.Scanner;

public class CheckRotation {

    /*
     * this function is just return string a rotated string from last
     * like if we enter "abcd" -> "dabc" or "dabc" -> "cdab"
     * what it does here is it rotated last char which is 'd' to first
     * and right shift all other chars
     */
    public static String rotS(char[] s) {
        int len = s.length;
        char temp = s[len - 1];
        char temp1 = s[0], temp2;
        for (int i = 0; i < len - 1; i++) {
            temp2 = s[i + 1];
            s[i + 1] = temp1;
            temp1 = temp2;
        }
        s[0] = temp;
        return new String(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String One: ");
        String sOne = sc.nextLine();
        System.out.println();
        System.out.print("Enter the String Two: ");
        String sTwo = sc.nextLine();
        char[] s2 = sTwo.toCharArray();
        boolean flag = false;
        /*
         * in this for loop what we are doing is rotating all possible
         * strings and comparing with sOne if it matches then its rotated
         * for ex: for "abcd" the possible cases of rotation are
         * { "abcd", "dabc", "cdab", "bcda" } which is 4
         * and it is equals to the length of string
         * thats why we loop to the length of string so that I can generate
         * all the possible rotation and compare is with the sOne
         */
        for (int i = 0; i < sOne.length(); i++) {
            String stt = rotS(s2);
            if (sOne.equals(stt)) {
                System.out.println("YES! Rotation!");
                flag = true;
            }
        }
        if (!flag)
            System.out.println("Not a Rotation!");

        sc.close();
    }
}
