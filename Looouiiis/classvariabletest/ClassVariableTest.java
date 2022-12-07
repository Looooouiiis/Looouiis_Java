package Looouiiis.classvariabletest;

public class ClassVariableTest {
    public static void main(String[] args) {
        TestClass ts = new TestClass(7);
        System.out.println(ts.getValue());
        ts.changeData(3);
        System.out.println(ts.getValue());
    }
}

class TestClass {
    static int data;

    public TestClass(int a) {
        data = a;
    }

    public void changeData(int a) {
        data = a;//静态变量data修饰符为final是为仅可在构造函数中初始化而无法更改的货真价实的常量
    }

    public int getValue() {
        return data;
    }
}
