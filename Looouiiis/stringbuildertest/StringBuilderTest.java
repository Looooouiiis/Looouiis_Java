package Looouiiis.stringbuildertest;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(3), sb1 = sb;
        sb.append("abcdefg");
        System.out.println(sb1.toString());
    }
}
