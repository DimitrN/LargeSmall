package ua.artcode.Week2.Wednesday_22_10_2014;

import ua.artcode.ArrayHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.10.14
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */

/*Задать два массива случайными числами от 8 до 80. Определить у какого из массива размерность
Трико больше.(размерность Трико массива - это количество четных элементов)*/

public class HT2_3_10 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int[] mas2 = new int[25];
        int count = 0;
        int count2 = 0;
        //first mas
        for(int i = 0; i < mas.length; i++){
            double rand = Math.random();
            if (rand>=0.1){
                mas[i] = (int) (rand * 80);
            } else {
                mas[i] = 8;
            }
            if (mas[i]%2==0){
                count++;
            }
        }
        ArrayHelper.printArr(mas);
        System.out.println("");
        System.out.println(count);

        //first mas
        for(int i = 0; i < mas2.length; i++){
            double rand = Math.random();
            if (rand>=0.1){
                mas2[i] = (int) (rand * 80);
            } else {
                mas2[i] = 8;
            }
            if (mas2[i]%2==0){
                count2++;
            }
        }
        ArrayHelper.printArr(mas2);
        System.out.println("");
        System.out.println(count2);

        if (count>count2)
            System.out.println("mas triko is bigger that mas2 triko");
        else
            System.out.println("mas2 triko is bigger that mas triko");
    }
}
