package Looouiiis.switchtest;

public class SwitchTest {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 7;
        a[2] = 22;
        for (int i = 0; i < 3; i++) {
            switch (a[i]) {
                case 3:
                    System.out.println(1);
//                    break;
                case 7:
                    System.out.println(2);
//                    break;
                case 22:
                    System.out.println(3);
//                    break;
            }
        }
    }
}
