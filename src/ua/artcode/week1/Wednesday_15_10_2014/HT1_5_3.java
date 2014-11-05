package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.10.14
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */

/*
Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
 */

public class HT1_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int i1 = sc.nextInt();
        System.out.println("Find digit in value");
        int i2 = sc.nextInt();
        int count = 0;
        int i = i1;

       while (i>=1){
           int digit = i%10;
           i = i/10;
           if (i2 == digit){
               count++;
           }
       }
        System.out.println(count);
    }
}
