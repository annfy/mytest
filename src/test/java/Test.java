import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {

        //第一种
        Class<Test> testClass = Test.class;

        //第二种
        try {
            Class<?> test = Class.forName("Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第三种
        Test test=new Test();
        Class<? extends Test> aClass = test.getClass();



    }



}
