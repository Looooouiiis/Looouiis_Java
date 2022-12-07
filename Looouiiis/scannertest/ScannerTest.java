package Looouiiis.scannertest;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.next();
            System.out.println(str);
        }
    }
}
