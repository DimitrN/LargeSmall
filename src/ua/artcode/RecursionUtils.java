package ua.artcode;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class RecursionUtils {

    // метод выводит на экран значение массива, на вход требует массив и начальный индекс ячейки массива, с воторой начинается вывод
    public static void printMas(int[] mas, int i){
        if(i >= mas.length){
            return;
        }
        System.out.print(mas[i] + " ");
        printMas(mas, i+1);
    }
}
