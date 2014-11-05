package ua.artcode.week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 22.10.14
 * Time: 20:44
 * To change this template use File | Settings | File Templates.
 */
public class Task2 {
    public static void main(String[] args) {
        int size = 10;
        int range = 50;
        int [] arr = ArrayHelper.genRandomMas(size, range);
        ArrayHelper.printArr(arr);
    }
}
