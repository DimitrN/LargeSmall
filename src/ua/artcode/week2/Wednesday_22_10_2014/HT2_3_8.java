package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 27.10.14
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */

/*Вывести в консоль элементы той половины одномерного массива у которой
среднее арифметическое максимальное*/

public class HT2_3_8 {
    public static void main(String[] args) {
        int range = 5;
        int [] arr = ArrayHelper.genRandomMas(range, 20);
        ArrayHelper.printArr(arr);

        int [] arr2 = new int[range/2];
        for (int i = 0;i<range/2; i++){
            arr2 [i] = arr[i];
        }
        //ArrayHelper.printArr(arr2);

        int [] arr3 = new int[range-range/2];
        for (int i = range/2, i2 = 0;i<arr.length; i++, i2++){
            arr3 [i2] = arr[i];
        }
        //ArrayHelper.printArr(arr3);


        double summ = 0;
        double summ2 = 0;
        int midle = arr.length/2;
        int i2 = midle;

        for (int i = 0; i < midle; i++){
            summ += arr[i];
        }
        for (int i = midle; i < arr.length;i++){
            summ2 += arr[i];
        }
        System.out.println ( summ/arr2.length + " / " + summ2/arr3.length);
        if (summ > summ2){
            ArrayHelper.printArr(arr2);
        }
        else
            ArrayHelper.printArr(arr3);
    }
}
