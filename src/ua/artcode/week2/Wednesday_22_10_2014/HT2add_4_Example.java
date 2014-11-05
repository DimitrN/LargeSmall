package ua.artcode.week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.11.14
 * Time: 12:34
 * To change this template use File | Settings | File Templates.
 */
public class HT2add_4_Example {
    public static void main(String[] args) {
        int [] Array = {1,2,5,7,9,0};
        int [] ArrayInv = HT2add_4.invertMat(Array);
        System.out.println("Задание 4.1");
        ArrayHelper.printArr(ArrayInv);


        int i = 70;
        boolean isSimple = HT2add_4.simpleDigit(i);
        System.out.println("");
        System.out.println("Задание 4.2");
        System.out.println(isSimple);


        int i2 = HT2add_4.commonDivider(3072, 1792);
        System.out.println("Задание 4.3");
        System.out.println(i2);


        int[] mass = {1,2,3,4,5};
        int [] newMass = HT2add_4.arrMove(mass,3);
        System.out.println("Задание 4.4");
        ArrayHelper.printArr(mass);
        System.out.println("");
        ArrayHelper.printArr(newMass);

        System.out.println("");
        HT2add_4_6.printTreeString(6);



        int ii, j, n = 4, m;
        for (ii = 0; ii < n; ++ii) {
            m = n - ii;
            for (j = 0; j < m; ++j)
                System.out.print('*');
            System.out.println();
        }


    }
}
