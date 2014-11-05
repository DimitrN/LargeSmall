package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 19:46
 * To change this template use File | Settings | File Templates.
 */
public class HT1add3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int digit1 = sc.nextInt();
        int i1 = digit1/100;
        int i2 = digit1%100/10;
        int i3 = digit1%10;



        //if (i3==i4)
          //  System.out.println("TRUE");
        //else
            System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
