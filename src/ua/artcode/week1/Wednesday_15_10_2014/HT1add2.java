package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        int i1 = 0;
        int i2 = a*a*a;
        int i3 = b*b*b;
        int i4 = c*c*c;

        if (a>0)
            System.out.println(i2);
        else
            System.out.println(i1);
        if (b>0)
            System.out.println(i3);
        else
            System.out.println(i1);
        if (c>0)
            System.out.println(i4);
        else
            System.out.println(i1);


    }
}