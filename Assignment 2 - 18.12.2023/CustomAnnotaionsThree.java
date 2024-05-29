import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface myAnnotationThree {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface what {
    String description();
}

@what(description = "AnnotationTestClass")
@myAnnotationThree(str = "MetaTwo", val = 69)
public class CustomAnnotaionsThree {
    
    @what(description = "AnnotationTestMethod")
    @myAnnotationThree(str = "Testinng", val = 70)
    public static void myMeth() {
        CustomAnnotaionsThree ob = new CustomAnnotaionsThree();
        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("All Annotations for Meta Two");
            for (Annotation annotation : annos) {
                System.out.println(annotation);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();

            System.out.println("All Annotations for myMethod");
            for (Annotation annotation : annos) {
                System.out.println(annotation);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found!");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
