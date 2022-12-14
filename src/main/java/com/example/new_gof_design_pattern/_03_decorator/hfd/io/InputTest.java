package com.example.new_gof_design_pattern._03_decorator.hfd.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
            System.out.println("=================================================");
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            System.out.println("\n=================================================");
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
