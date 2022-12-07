package Looouiiis.iotest.readtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        System.out.println(read);
    }
}
