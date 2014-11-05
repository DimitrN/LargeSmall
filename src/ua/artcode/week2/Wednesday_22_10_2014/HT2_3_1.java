package ua.artcode.week2.Wednesday_22_10_2014;
import ua.artcode.ArrayHelper;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 26.10.14
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 */

/*Поменять две переменные местами, не используя дополнительную переменную*/

public class HT2_3_1 {
    public static void main(String[] args) {
        int [] arr = new int[2];
        arr [0] = 2;
        arr [1] = 5;
        ArrayHelper.printArr(arr);
        arr[0] = arr[1]+arr[0];
        arr[1] = arr[0]-arr[1];
        arr[0] = arr[0]-arr[1];
        ArrayHelper.printArr(arr);
    }
}
