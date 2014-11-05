package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class HT1add7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number");
        int a = sc.nextInt();

        if (a>=1 && a<=12){
            if (a==1 || a==2 || a==12)
                System.out.println("Winter");
            if (a==3 || a==4 || a==5)
                System.out.println("Spring");
            if (a==6 || a==7 || a==8)
                System.out.println("Summer");
            if (a==9 || a==10 || a==11)
                System.out.println("Autumn");

        }else
            System.out.println("Enter correct month number");

    }
}