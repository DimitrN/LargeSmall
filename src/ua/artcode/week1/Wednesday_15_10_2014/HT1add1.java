package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        int ab = a*a+b*b;
        int cc = c*c;

        if (ab==cc)
            System.out.println("Прямоугольный");
        else
            System.out.println("Не прямоугольный");

    }
}
