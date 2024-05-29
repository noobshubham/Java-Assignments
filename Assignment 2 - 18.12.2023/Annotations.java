import java.util.ArrayList;
import java.util.List;

class AnnotationsCheck {

    void student() {
        System.out.println("I am a students!");
    }

    @Deprecated
    void graduation() {
        System.out.println("Done!");
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int... nums) {
        int t = 0;
        for (int i : nums)
            t += i;
        return t;
    }
}

public class Annotations extends AnnotationsCheck {

    @Override
    void student() {
        super.student();
        System.out.println("I am also a inherited student!");
    }

    public static void main(String[] args) {
        AnnotationsCheck foo = new AnnotationsCheck();
        foo.student();
        foo.graduation();

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);

        for (int i : list) {
            System.out.println(i);
        }

        int re = foo.sum(5, 6, 7, 8, 9);
        System.out.println("total: " + re);
    }

}
