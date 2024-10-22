package d27exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s, a, b);

    } //main disi

    public static void getCharFromString(String s, int a, int b) {

        int idx = a / b;
        char ch = s.charAt(idx);
        System.out.println(ch);

    }

}