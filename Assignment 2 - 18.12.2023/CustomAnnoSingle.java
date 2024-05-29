import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value();
}

public class CustomAnnoSingle {

    @MySingle(value = 86)
    public static void MyMeth() {
        CustomAnnoSingle ob = new CustomAnnoSingle();
        try {
            Class c = ob.getClass();
            Method m = c.getMethod("MyMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found!");
        }
    }

    public static void main(String[] args) {
        MyMeth();
    }
}
