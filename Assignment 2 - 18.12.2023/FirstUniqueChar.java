import java.util.Scanner;

class FirstUniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        for (int i = 0; i < txt.length(); i++) {
            boolean flag = true;
            for (int j = i + 1; j < txt.length(); j++) {
                if (txt.charAt(i) == txt.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(txt.charAt(i));
                break;
            }
        }
        sc.close();
    }
}
