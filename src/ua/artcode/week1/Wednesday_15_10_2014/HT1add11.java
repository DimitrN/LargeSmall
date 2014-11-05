package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int a = sc.nextInt();

        if (a==1 || a==21 || a==31 || a==41 || a==51 || a==61 || a==71 || a==81 || a==91)
            System.out.println(a + " копейка");
        if (2<=a && a<=4 || 22<=a && a<=24 || 32<=a && a<=34 || 42<=a && a<=44 || 52<=a && a<=54 || 62<=a && a<=64 || 72<=a && a<=74 || 82<=a && a<=84 || 92<=a && a<=94)
            System.out.println(a + " копейки");
        if (5<=a && a<=20 || 25<=a && a<=30 || 35<=a && a<=40 || 45<=a && a<=50 || 55<=a && a<=60 || 65<=a && a<=70 || 75<=a && a<=80 || 85<=a && a<=90 || 95<=a && a<=99)
            System.out.println(a + " копеек");

    }
}