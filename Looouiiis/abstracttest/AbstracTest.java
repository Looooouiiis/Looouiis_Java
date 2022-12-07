package Looouiiis.abstracttest;

public abstract class AbstracTest {
    public static void main(String[] args) {
        AbstracTest as = new Realise();
        as.show();
    }
    abstract void show();
}
class realise extends AbstracTest{
    @Override
    void show() {
        System.out.println(1);
    }
}
class Realise extends AbstracTest{
    @Override
    void show() {
        System.out.println(2);
    }
}
abstract class Abstract{
    void show(){

    }
    abstract void limit();
}