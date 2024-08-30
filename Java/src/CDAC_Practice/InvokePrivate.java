package itssachin.assignments3;
import java.lang.reflect.Method;

public class InvokePrivate {
    private void privateMethod() {
        System.out.println("Hello from a private method!");
    }
}
class MethodCall{
    public static void main(String[] args)throws Exception{
        InvokePrivate c = new InvokePrivate();

        // Using getDeclareMethod() method
        Method m = InvokePrivate.class.getDeclaredMethod("privateMethod");

        // Using setAccessible() method
        m.setAccessible(true);

        // Using invoke() method
        m.invoke(c);
    }
}