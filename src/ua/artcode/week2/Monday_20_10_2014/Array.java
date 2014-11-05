package ua.artcode.Week2.Monday_20_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 20.10.14
 * Time: 21:27
 * To change this template use File | Settings | File Templates.
 */
public class Array {
    public static void main(String[] args) {
        // <type>[] <name> new <type>[<size>];
        // <type>[] <name> = {<value>, <value>, <value>,};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int i = sc.nextInt();

        int[] mas = new int[5];
        mas[0] = 78;
        mas[1] = 12;
        mas[2] = 88;
        System.out.println(mas[3]);

        int[] arr = {12,9,3,5,15,4};
        int sizeArr = arr.length;


    }
}
