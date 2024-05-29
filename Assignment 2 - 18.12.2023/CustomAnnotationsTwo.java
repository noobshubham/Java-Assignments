import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String name();
    int age();
}

public class CustomAnnotationsTwo {

    @MyAnnotation(name = "shubham", age = 23)
    public static void myMethod(String str, int i) {
        CustomAnnotationsTwo object = new CustomAnnotationsTwo();
        
        try {
            Class c = object.getClass();
            Method m = c.getMethod("myMethod", String.class, int.class);
            MyAnnotation anno = m.getAnnotation(MyAnnotation.class);
            System.out.println(anno.name() + " " + anno.age());
        } catch (Exception e) {
            System.out.println("Method Not Found!");
        }
    }

    public static void main(String[] args) {
        myMethod("lolz", 5);
    }
}
