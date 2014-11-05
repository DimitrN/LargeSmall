package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 16.10.14
 * Time: 14:48
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if (hour >= 8 && hour <= 21){
            System.out.println("Привет");
        }
        else {
            System.out.println("Абонент отдыхает!");
        }
    }
}
