import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface DefaultAnno {
    int value() default 100;
}

public class CustomAnnoDefault {

    @DefaultAnno
    public static void MyMeth() {
        CustomAnnoDefault ob = new CustomAnnoDefault();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("MyMeth");
            DefaultAnno anno = m.getAnnotation(DefaultAnno.class);
            System.out.println(anno.value());
        } catch (Exception e) {
            System.out.println("Method Not Found!");
        }
    }

    public static void main(String[] args) {
        MyMeth();
    }
}
