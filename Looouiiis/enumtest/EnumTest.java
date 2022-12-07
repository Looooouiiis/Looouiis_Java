package Looouiiis.enumtest;

enum FreshJuiceTest {
    LARGE,MEDIUM,SMALL
}

enum ColaTest {
    LARGE,MEDIUM,SMALL
}

public class EnumTest {

    public static void main(String[] args) {
        FreshJuiceTest juice= FreshJuiceTest.LARGE;
        switch (juice){
            case SMALL -> System.out.println(1);
            case LARGE -> System.out.println(2);
            case MEDIUM -> System.out.println(3);
        }
        if(juice.equals(ColaTest.LARGE)){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
    }
}
