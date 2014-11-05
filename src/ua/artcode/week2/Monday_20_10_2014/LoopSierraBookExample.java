package ua.artcode.Week2.Monday_20_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 22.10.14
 * Time: 10:10
 * To change this template use File | Settings | File Templates.
 */

/*
заполнить массив с помощью цикла
 */

public class LoopSierraBookExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length");
        int mas_size = sc.nextInt(); // вводим в консоль величину создаваемого массива
        int [] mas = new int[mas_size]; // создаем массив
        int x = 0; // индекс первой ячейки массива, изменяется в результате цикла ниже
        int mas_start_value = 7; // значение ячейки массива с инлексом "0"
        String str = ""; // опционально, объявляем переменную с пустым значением (используем для красоты, в конце выводим массив в фигурных скобках)

        while (x < mas.length){ // пока индекс ячеек массива меньше величины массива - делаем цикл
            mas [x] = mas_start_value; // присваиваем ячейке массива с индексом "0" значение "mas_start_value" (оба изменяются в результате цикла)
            str =str + "," + mas_start_value; // опционально, формируем строку из всех значений массива и разделяем все значения запятой
            System.out.println("Array slot" + x + " equal to " + mas_start_value); // выводим номер ячейки массива и ее значение
            mas_start_value *= 2; // начиная со стартового все последующие значения массива умножаются на "2"
            x ++; // в конце каждого цикла индекс ячейки возрастает на "1"
        }


        str = str.substring(1,str.length()); // опционально, обрезаем первый ненужный символ (запятую) в строке
        System.out.println("Result is {"+str+"}"); // опционально, выводим массив в фигурных скобках
    }
}
