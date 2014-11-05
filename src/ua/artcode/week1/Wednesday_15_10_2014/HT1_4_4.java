package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 17.10.14
 * Time: 15:39
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter value");
        double d1 = sc.nextDouble ();
        double i1 = d1 * 2;

        if (d1 > 0 && d1 <1)
            System.out.println(i1);
        else
            System.out.println("The number is uot of range (0;1)");

    }
}
