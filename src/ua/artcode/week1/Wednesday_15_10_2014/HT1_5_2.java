package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
public class HT1_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int start = 1;
        int i1 = sc.nextInt();
        int factorial = 1;

        while (start<=i1){
            factorial *= start;
            start++;
        }
        System.out.println(factorial);
    }
}
