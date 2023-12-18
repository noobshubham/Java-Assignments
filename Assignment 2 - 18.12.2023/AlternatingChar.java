import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class AlternatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        if (text.length() < 2 && text.charAt(0) == text.charAt(1)) {
            System.out.println("No");
        } else {
            Character first = text.charAt(0);
            Character second = text.charAt(1);
            if (first == second) {
                System.out.println("No");
            } else {
                for (int i = 2; i < text.length(); i++) {
                    if (i % 2 == 0 && text.charAt(i) != first) {
                        System.out.println("No");
                        break;
                    } else if (i % 2 != 0 && text.charAt(i) != second) {
                        System.out.println("No");
                        break;
                    }
                }
                System.out.println("Yes");
            }

        }
        scanner.close();
    }
}
