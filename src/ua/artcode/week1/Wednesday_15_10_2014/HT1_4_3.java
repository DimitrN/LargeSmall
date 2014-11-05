package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 17.10.14
 * Time: 14:52
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter value");
        int digit1 = sc.nextInt();
        int i1 = 7;
        int i2 = digit1 * 2;

        if (0 == (digit1 % i1) )
            System.out.println(i2);
        else
            System.out.println("The number is not divisible by 7");

    }
}
