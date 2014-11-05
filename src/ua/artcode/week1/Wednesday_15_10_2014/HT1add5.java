package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();

        if (a==b || b==c || a==c)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}