package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int digit1 = sc.nextInt();
        System.out.println("Enter second value");
        int digit2 = sc.nextInt();
        int i3 = digit1%1000000%100000%10000%1000%100%10;
        int i4 = digit2%1000000%100000%10000%1000%100%10;

        if (i3==i4)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}
