import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class CustomMarkerAnno {

    @MyMarker
    public static void MyMeth() {
        CustomMarkerAnno ob = new CustomMarkerAnno();
        try {
            Method m = ob.getClass().getMethod("MyMeth");
            if (m.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is Present!");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found!");
        }
    }

    public static void main(String[] args) {
        MyMeth();
    }
}
