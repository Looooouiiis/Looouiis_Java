package Looouiiis.iotest.filetest.writertest;

import java.io.*;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\writer.txt");
        FileOutputStream out = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(out);
        writer.append("还可以这样");
        writer.close();
        out.close();
    }
}
