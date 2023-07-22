// solution for the code of ellucian test - 22/07/2023

public class MagicValue {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 1, 2, 3, 4 };
        System.out.println("Answer: " + magicValue(a, b, 4));
    }

    static int magicValue(int a[], int b[], int n) {
        double result = 0;

        for (int i = 0; i < n; i++) {
            result += Math.ceil(a[i] * b[i]) / 2;
        }

        return (int) (result % (Math.pow(10, 9) + 7));
    }
}
