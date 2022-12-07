package Looouiiis.quotetest;

public class QuoteTest {
    public static void main(String[] args) {
        String a = "Looouiiis";
        String b = a;
        String c = new String("Looouiiis Louis");
        fakeString fs = new fakeString();
        b += " Louis";
        System.out.println(a);
        System.out.println(b);
        quoteTest(c);
        System.out.println(c);
        quoteTest_fakeString(fs);
        System.out.println(fs.getValue());
    }

    static void quoteTest(String c) {
        c = "Looouiiis";
    }

    static void quoteTest_fakeString(fakeString c) {
        c.changeValue("Looouiiis");
    }

}

class fakeString {
    public void changeValue(String a) {
        value = a;
    }

    public String getValue() {
        return value;
    }

    private String value = "Looouiiis Louis";
}