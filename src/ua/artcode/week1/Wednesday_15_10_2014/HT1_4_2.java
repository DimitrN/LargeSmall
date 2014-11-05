package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 16.10.14
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first value");
        int digit1 = sc.nextInt();
        System.out.println("Please, enter second value");
        int digit2 = sc.nextInt();
        System.out.println("Please, enter third value");
        int digit3 = sc.nextInt();

        if (digit1==digit2 || digit1==digit3){
            System.out.println("The numbers are equal");
        } else {
        if (digit1 > digit2){
            if (digit1 > digit3){
                if (digit2 > digit3){
                    System.out.println("The largest value is " + digit1 + ".");
                    System.out.println("The lowest value is " + digit3 + ".");
                }
                else {
                    System.out.println("The largest value is " + digit1 + ".");
                    System.out.println("The lowest value is " + digit2 + ".");
                }
            }
            else {
                System.out.println("The largest value is " + digit3 + ".");
                System.out.println("The lowest value is " + digit2 + ".");
            }
        }


        else {
            if (digit2 > digit3){
                if (digit3 > digit1) {
                    System.out.println("The largest value is " + digit2 + ".");
                    System.out.println("The lowest value is " + digit1 + ".");
                }
                else {
                    System.out.println("The largest value is " + digit2 + ".");
                    System.out.println("The lowest value is " + digit3 + ".");
                }
            }
            else {
                System.out.println("The largest value is " + digit3 + ".");
                System.out.println("The lowest value is " + digit1 + ".");
            }
        }
    }
}
}