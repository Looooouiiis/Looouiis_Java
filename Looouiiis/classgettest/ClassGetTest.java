package Looouiiis.classgettest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassGetTest {
    public static void main(String[] args) {

        try{
            Class c = Class.forName("Looouiiis.classgettest.JavaCoder");
            Coder cd = (Coder)c.newInstance();
            cd.code();
            Field[] fields = c.getDeclaredFields();
            for(Field f : fields){
                System.out.println(f);
            }
            Method[] declaredMethods = c.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod);
            }
        } catch(Exception e){

        }
    }
}
abstract class Coder{
    abstract void code();
}
class JavaCoder extends Coder{
    int a,b,c;
    @Override
    void code(){
        System.out.println("JavaCoder is coding");
    }
}
class CppCoder extends Coder{
    @Override
    void code(){
        System.out.println("CppCoder is coding");
    }
}
