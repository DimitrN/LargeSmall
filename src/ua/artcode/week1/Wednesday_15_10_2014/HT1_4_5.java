package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 17.10.14
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int digit1 = sc.nextInt();
        System.out.println("Enter second value");
        int digit2 = sc.nextInt();
        int digit3 = digit1-digit2;
        int digit4 = digit1+digit2;

        if (digit1>=digit2){
            if (digit1==digit2)
                System.out.println("The numbers are equal");
            else
                System.out.println("The difference of the number is " + digit3);
        }
        else
            System.out.println("The sum of the numbers is " + digit4);
    }
}