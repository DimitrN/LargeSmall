package ua.artcode.Week2.Monday_20_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 20.10.14
 * Time: 21:47
 * To change this template use File | Settings | File Templates.
 */
public class ArrayMyself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int i = sc.nextInt();
        int[] mas = new int[i];
        int start = 0;


        if (i%2==0){
            i= i+1;
            while (start < mas.length){
                System.out.println("Array slot " + start + " equal to " + i);
                mas[start] = i;
                start++;
                i +=2;
            }
            System.out.println("Now display Array values in reverse");
            while (start>=1){
                i -=2;
                start --;
                System.out.println(i);
            }
        }
        else{
            while (start < mas.length){
                System.out.println("Array slot " + start + " equal to " + i);
                mas[start] = i;
                start++;
                i +=2;
            }
            System.out.println("Now display Array values in reverse");
            while (start>=0){
                i -=2;
                start --;
                System.out.println(i);
            }
        }

    }
}
