package Looouiiis.extendtest;

public class ExtendTest {
    public static void main(String[] args) {
    Test ts=new Test();
        System.out.println(ts.a);
    }
    public int a;
}
class Original{
    int a;
}
class Test extends Original{
    Test(){
        a=3;
    }
}
