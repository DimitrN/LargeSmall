package ua.artcode.week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 26.10.14
 * Time: 21:50
 * To change this template use File | Settings | File Templates.
 */

/*Найти минимальное и максимальное значения в массиве и вывести их на консоль*/

public class HT2_3_2 {
    public static void main(String[] args) {
        int [] arr = ArrayHelper.genRandomMas(4,10);
        ArrayHelper.printArr(arr);
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>max)
                max = arr[i];
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
    }
}
