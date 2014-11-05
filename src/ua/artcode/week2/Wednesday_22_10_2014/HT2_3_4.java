package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27.10.14
 * Time: 15:44
 * To change this template use File | Settings | File Templates.
 */

/*Заданы два массива одинаковой длинны с любыми значениями
        скопировать данные из первого массива во второй*/

public class HT2_3_4 {
    public static void main(String[] args) {
        int [] arr = ArrayHelper.genRandomMas(4, 10);
        int [] arr2 = ArrayHelper.genRandomMas(4, 20);
        ArrayHelper.printArr(arr);
        ArrayHelper.printArr(arr2);
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = arr2[i];/*+ arr[i]; // поменять местами значения массивов
            arr2[i] = arr[i] - arr2[i];
            arr[i] = arr[i] - arr2[i];*/
        }
        ArrayHelper.printArr(arr);
        ArrayHelper.printArr(arr2);
    }
}
