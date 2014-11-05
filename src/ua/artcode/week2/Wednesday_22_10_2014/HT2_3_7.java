package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27.10.14
 * Time: 16:21
 * To change this template use File | Settings | File Templates.
 */

/*Найти среднее арифметическое массива*/

public class HT2_3_7 {
    public static void main(String[] args) {
        int [] arr = ArrayHelper.genRandomMas(5,20);
        ArrayHelper.printArr(arr);
        double summ = 0;

        for (int i = 0; i < arr.length; i++){
            summ += arr[i];
        }
        System.out.println(summ/arr.length);
    }
}
