package ua.artcode.Week1.Wednesday_15_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.10.14
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
/* перевод введенного с консоли числа из двоичной в десятичную
*/
public class HT1_5_1_BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int dec = sc.nextInt();
        //String slot = sc.nextLine(); // объявляем переменную slot, которую пользователь вводит в десятичном виде
        //int length = slot.length(); // объявляем переменную length, которая равна величине массива
        int i = 0; // объявляем переменную i - индекс первой
        //int [] mas = new int[10000000];
        int decResult = 0; // объявляем переменную decResult - вводится для подсчета конечного значения

        while (dec>=1){ // пока введенное пользователем значение больше равно 1 - делать цикл
            int last_digit = dec%10; // расчленяем на цифры введенное число, с каждым циклом определяется новая цифра с права на лево.
            //mas [i] = last_digit;
            dec = dec/10; // шаг цикла, так же служит для расчленения числа на цифры
            int w = (int) Math.pow(2,i)*last_digit; // действие, аналогичное переводу числа из двоичной в десятичную в тетрадке
            //System.out.println(last_digit+"+"+i +" / "+ w);
            i++;
            decResult += w; // действие суммирует все числа, полученные через  (int) Math.pow(2,i)*last_digit
        }
        System.out.println(decResult);
    }
}
