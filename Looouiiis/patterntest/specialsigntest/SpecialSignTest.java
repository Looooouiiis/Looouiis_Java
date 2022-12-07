package Looouiiis.patterntest.specialsigntest;

import java.util.regex.Pattern;

public class SpecialSignTest {
    public static void main(String[] args) {
        String pattern="(1\\D2)(3\\D7)";
        String pat="(\\D*)(\\d+)(.*)";
        Pattern r=Pattern.compile(pattern);
        System.out.println("1\n2");
    }
}
