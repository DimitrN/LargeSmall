package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 19.10.14
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
public class HT1_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter first value");
        int digit1 = sc.nextInt();
        System.out.println("Please, enter second value");
        int digit2 = sc.nextInt();
        int i1 = digit1/digit2;
        int i2 = digit2/digit1;
        int remainder1 = digit1%digit2;
        int remainder2 = digit2%digit1;

        if (digit1>digit2){
            if (remainder1==0)
                System.out.println("TRUE. Integer is "+ i1+ " and remainder is "+remainder1);
            else
                System.out.println("FALSE. Integer is "+ i1+ " and remainder is "+remainder1);

        } else {
            if (remainder2==0)
                System.out.println("TRUE. Integer is "+ i2+ " and remainder is "+remainder2);
            else
                System.out.println("FALSE. Integer is "+ i2+ " and remainder is "+remainder2);
        }
        //if (remainder1>0 || remainder2>0){
            //if (remainder1>0)
              //  System.out.println("FALSE. Integer is "+ i1+ " and remainder is "+remainder1);
            //else
              //  System.out.println("FALSE. Integer is "+ i2+ " and remainder is "+remainder2);

        }
    }
//}
