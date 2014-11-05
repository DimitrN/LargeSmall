package ua.artcode.Week2.Monday_20_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 20.10.14
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */

/* Пользователь воодит число. Вывести на экран последовательность чисел от "1" до введенного числа с шагом 1, и наоборот
 */

public class LoopMyself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int i1 = sc.nextInt();
        int start = 1;
        int start2 = 1;


        while (start<i1){  // пока введенное число больше 1 делать цикл
            System.out.println(start);
            start++; // в конце цикла переменная старт = введенному числу-1
        }
        while (start2<=start){
            System.out.println(start);
            start--;
        }

    }
}
