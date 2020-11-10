import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRun {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Test test=new Test();

        Class<?> cl=Test.class;

        Method [] methods= cl.getMethods();
        for(Method method:methods){
            if (method.isAnnotationPresent(MyNewAnotation.class)){
                MyNewAnotation an=method.getAnnotation(MyNewAnotation.class);

                    method.invoke(test,an.a(), an.b());
                    System.out.println("yes");

            }
        }


    }
}
