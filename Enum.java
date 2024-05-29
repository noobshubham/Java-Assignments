import java.util.Scanner;

enum subject {
    JAVA(10), PYTHON(9), CC(12), IOT(15);

    private int marks;

    subject(int p) {
        marks = p;
    }

    int getMarks() {
        return marks;
    }
}

public class Enum {

    public static void main(String[] args) {
        subject sub;

        sub = subject.CC;

        switch (sub) {
            case JAVA:
                System.out.println("JAVA Marks : "+subject.JAVA.getMarks());
                break;
            case PYTHON:
                System.out.println("PYTHON Marks : "+subject.PYTHON.getMarks());
                break;
            case CC:
                System.out.println("CC Marks : "+subject.CC.getMarks());
                break;
            case IOT:
                System.out.println("IOT Marks : "+subject.IOT.getMarks());
                break;
        }
    }
}
