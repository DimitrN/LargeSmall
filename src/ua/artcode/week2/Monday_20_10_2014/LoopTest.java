package ua.artcode.Week2.Monday_20_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 20.10.14
 * Time: 20:03
 * To change this template use File | Settings | File Templates.
 */

/*
Первые шаги знакомства с циклами
 */
public class LoopTest {
    public static void main(String[] args) {
        // while

        int count = 0; // start
        while(count < 10) {
            System.out.println("Do work it " + count + " pos");
            count++; //way
        }
        // do-while
        int i = 10;
        do {
            System.out.println(i + " ");
            i -= 2;// последовательность парных чисел (10 - 2 = 8, следующее значение "8")
        } while (i > 0);

        // for
        for (int i1 = 1; i1<=10; i1++){
            System.out.println(i1);
        }
    }
}



