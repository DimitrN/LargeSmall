package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.10.14
 * Time: 12:19
 * To change this template use File | Settings | File Templates.
 */
public class HT2_3_11 {
    public static void main(String[] args) {
        int[] mas = {5,6,8,7,9,6,4,5,8,7};
        int[] newmas = ArrayHelper.splitArray(mas,7,8);
        ArrayHelper.printArr(newmas);
    }
}
