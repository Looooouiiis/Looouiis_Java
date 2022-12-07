package Looouiiis.breaktest;

public class BreakTest {
    public static void main(String[] args) {
        loop:
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
            for (int j = 0; j < 3; j++) {
                System.out.println("2");
                for (int k = 0; k < 10; k++) {
                    if(k%2==0)
                        continue loop;  //标记只能打在for之前，且其与for之间不能有其他语句，否则标记不能被continue识别
                }
            }
        }
    }
}
