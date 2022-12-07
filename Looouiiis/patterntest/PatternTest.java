package Looouiiis.patterntest;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String pat= ".*o{2}.*";
        System.out.println(Pattern.matches(pat,"food"));
    }
}
