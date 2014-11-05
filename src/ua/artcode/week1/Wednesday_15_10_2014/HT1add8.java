package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchase sum");
        int a = sc.nextInt();
        double discount = a*0.9;

        if (a>1000)
            System.out.println("Your discounted sum is " + discount + " UAH");
        else
            System.out.println("You have no discount");

    }
}