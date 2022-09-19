package com.test;

import static java.lang.Math.multiplyExact;

public class Main {

    public static final String TEXT = "some text";

    public static void main(String[] args) {
        System.out.println(TEXT);

        String s = "Hey how are you?";
        print(s);
        printMultiply(2,3);
    }
    private static void print(String string) {
        System.out.println(string);
    }
    private static void printMultiply(int x, int y){
        System.out.println(multiplyExact (x,y));
    }
}
