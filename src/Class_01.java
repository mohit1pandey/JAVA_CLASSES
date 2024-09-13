//Class class

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class_01 {

    private String ClassName;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

    Class<?> myClass= ExampleClass.class; // Load ExampleClass and get its Class object
//        try {
//            Class<?> myClass = Class.forName("ExampleClass"); // Load ExampleClass and get its Class object
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        Object obj=myClass.newInstance(); // deprecated but we can use it second method is lengthy
        ExampleClass ec= (ExampleClass) obj; // now can access methods of Exmapleclass diraclty

        System.out.println(myClass.getClass());
        Field field= myClass.getField("name");
        System.out.println(field.get(ec)); // prints hello
        Method method= myClass.getMethod("methodX");
        method.invoke(ec);
    }

}


// Example Class
class ExampleClass{

public String name= "HELLO";
    public ExampleClass(){
        System.out.println("Default constructor called");
    }

    public  ExampleClass(String val){
        System.out.println("Argument constructor called : " + val);
    }

    public  int methodX(){

        System.out.println("methodX called");
        return 10;
    }
};