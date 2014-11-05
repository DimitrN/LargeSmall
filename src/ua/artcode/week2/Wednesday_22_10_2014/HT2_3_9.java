package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */

/*Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива
который получается в результате суммы arr1[i] + arr2[i]*/

public class HT2_3_9 {
    public static void main(String[] args) {
        int size = 10;
        int [] arr = ArrayHelper.genRandomMas(size,5);

        ArrayHelper.printArr(arr);
        System.out.println("");
        int [] arr2 = ArrayHelper.genRandomMas(size, 5);

        ArrayHelper.printArr(arr2);
        System.out.println("");
        int [] arr3 = new int[size];

        for (int i = 0; i < arr.length; i++){
            arr3 [i] = arr [i]+arr2[i];
        }ArrayHelper.printArr(arr3);
    }
}
