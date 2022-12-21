package com.example.demo;

import java.util.Scanner;

public class Testball {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        Ball b1 =new Ball("Wilson",1200);
    String name1=in.next();

    Ball b2 =new Ball(name1);
    Ball b3 = new Ball();
    b2.setPrice(1450);
    b3.setBrand("Gala");
    System.out.println(b1);
    b2.sale(20);
    System.out.println(b2);
    }
}