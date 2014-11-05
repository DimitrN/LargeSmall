package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 12:18
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first value");
        int digit1 = sc.nextInt();
        System.out.println("Please, enter second value");
        int digit2 = sc.nextInt();
        int digit3 = digit1 + digit2;

        if (digit3>11 && digit3<19)
            System.out.println("Value "+digit3+" is in range (11;19)");
        else
            System.out.println("The sum is out of range (11;19)");
    }
}
