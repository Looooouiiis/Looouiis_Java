package Looouiiis.downchangetest;

public class DownChangeTest {
    public static void main(String[] args) {
        Animal p = new cat();
        p.yield();
        cat q = (cat)p; //向下转型，以使用父类没有的子类方法，注意不能自己转型再赋给自己，属于数据类型不匹配将强制转来的自动转回去了
        q.work();
    }
}
class Animal{
    void yield(){
        System.out.println("1");
    }
}
class cat extends Animal{
    @Override
    void yield(){
        System.out.println("2");
    }
    void work(){
        System.out.println("3");
    }
}
