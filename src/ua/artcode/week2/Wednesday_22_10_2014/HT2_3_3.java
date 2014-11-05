package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27.10.14
 * Time: 14:15
 * To change this template use File | Settings | File Templates.
 */

/*Найти минимальное и максимальное значения в массиве и поменять местами наибольший
        и наименьший элементы*/

public class HT2_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter array range");
        int range = sc.nextInt();
        int [] arr = ArrayHelper.genRandomMas(size, range);
        ArrayHelper.printArr(arr);
        int max = arr[0];
        int min = arr[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Max is "+arr[maxIndex] + " and maxIndex is "+maxIndex);
        System.out.println("Min is "+arr[minIndex] + " and minIndex is "+ minIndex);
        arr[maxIndex] = arr[maxIndex]+arr[minIndex];
        arr[minIndex] = arr[maxIndex]-arr[minIndex];
        arr[maxIndex] = arr[maxIndex]-arr[minIndex];
        System.out.println("Max is "+arr[minIndex] + " and maxIndex is "+ minIndex);
        System.out.println("Min is "+arr[maxIndex] + " and minIndex is "+maxIndex);
    }
}
