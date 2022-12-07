package Looouiiis.charactertest;

public class CharacterTest {
    public static void main(String[] args) {
        Character uniChar = '\u039A';
        System.out.println(Character.isDigit(uniChar));
        System.out.println(Character.isLetter(uniChar));
    }
}
