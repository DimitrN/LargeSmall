package ua.artcode.week2.Wednesday_22_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 22.10.14
 * Time: 19:23
 * To change this template use File | Settings | File Templates.
 */

/* создать массив, величину вводит пользователь, половина значений массива - париные, вторая половина - непарные
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int arraySize = sc.nextInt();
        int startValue = 0;
        int startValue2 = 1;
        int [] mas = new int[arraySize];
        int i = 0;
        int mid = mas.length/2;
        int i2 = mid;

        while (i< mid){
                mas[i] = startValue;
                startValue +=2;
                System.out.println(startValue);
            i++;
            }
        //second part
        /*for (int i2 = mid, num = 1; i < mas.length; i++, num +=2){
            mas[i2] = num;
        }
        System.out.println("Array = ");
        */
        while (i2 < mas.length){
                mas[i2] = startValue2;
                startValue2 +=2;
                System.out.println(startValue2);
            i2++;
            }
        }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public  int[] genMas (int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        return mas;
    }
}

