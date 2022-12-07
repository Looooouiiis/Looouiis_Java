package Looouiiis.testcheck;

public class TestCheck {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        ChangeIt.doIt(myArray);
        for (int j = 0; j < myArray.length; j++)
            System.out.print(myArray[j] + " ");
    }
}

class ChangeIt {
    static void doIt(int[] z) {
        for (int i = 0; i < 5; i++) {
            z[i] = 0;
        }
    }
}