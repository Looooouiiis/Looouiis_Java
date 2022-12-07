package Looouiiis.iotest.filetest;

import javax.swing.plaf.metal.MetalIconFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File rfile = new File("D:\\新建  文本文档.txt");
        if(!rfile.exists()){
            throw new IOException();
        }
        File wfile = new File("D:\\新建文本文档.txt");
        FileInputStream in = new FileInputStream(rfile);
        FileOutputStream out = new FileOutputStream(wfile);
        byte[] by = new byte[1];
        while(in.read(by)!=-1){
            System.out.print((char)by[0]);
            out.write(by);
        }
        in.close();
        out.close();
    }
}
