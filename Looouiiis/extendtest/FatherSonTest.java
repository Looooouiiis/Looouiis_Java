package Looouiiis.extendtest;

public class FatherSonTest {
    public static void main(String[] args) {//子类赋到父类可以自动转化，父类赋到子类需要强制转化。若声明即为父类则无论如何不能赋给子类变量
        Father obj = new Son();
        Father obj1 = (Father) obj;
        Son obj2 = (Son) obj1;//若声明为子类则兜兜转转都能强转后赋给非有继承关系的非子类变量
        obj2.cry();
    }
}

class Father {
    String str = "Father";

    String getName() {
        return str;
    }
}

class Son extends Father {
    String str = "Son";

    @Override
    String getName() {
        return str;
    }

    void cry() {
        System.out.println("wawawa");
    }
}
