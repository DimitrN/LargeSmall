package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.10.14
 * Time: 13:52
 * To change this template use File | Settings | File Templates.
 */

/* перевод введенного с консоли числа из десятичной в двоичную
*/

public class HT1_5_1_DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int i = sc.nextInt();
        String str = "";

        while (i>=1){
            int i2 = i%2;
            i=i/2;
            str = i2+str;
        }
        System.out.println(str);
    }
}
