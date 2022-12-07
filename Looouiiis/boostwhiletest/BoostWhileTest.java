package Looouiiis.boostwhiletest;

public class BoostWhileTest {
    public static void main(String[] args) {
        int[] a = new int[3];
        int i = 0;
        for (int x : a) {
        /*
        此时的x仅仅数值上等于对应的数组a中元素的值，但无引用关系，故对x的修改不会影响到a中对应元素的值
        */
            a[i] = i;
            i++;
//            x=i;
//            if(x==i){
//                System.out.println(1);
//            }
//            else
//                System.out.println(0);
//            i++;
        }
        for (int j = 0; j < 3; j++) {
            System.out.println(a[j]);
        }
    }
}
