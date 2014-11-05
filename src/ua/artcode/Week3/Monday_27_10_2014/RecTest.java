package ua.artcode.Week3.Monday_27_10_2014;

import ua.artcode.ArrayHelper;
import ua.artcode.RecursionUtils;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class RecTest {
    public static void main(String[] args) {
        int[] mas = ArrayHelper.genRandomMas(3, 10);
        RecursionUtils.printMas(mas, 0);
    }
}
