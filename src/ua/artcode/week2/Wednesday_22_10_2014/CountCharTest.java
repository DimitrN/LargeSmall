package ua.artcode.week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 22.10.14
 * Time: 22:02
 * To change this template use File | Settings | File Templates.
 */
public class CountCharTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter srting");
        String seq = sc.nextLine();

        System.out.println("Enter some char");
        String str = sc.nextLine();
        char c = str.charAt(0);
        int count = ArrayHelper.countChar(seq, c);
        System.out.println("count of " + c + " = " + count);
    }
}
