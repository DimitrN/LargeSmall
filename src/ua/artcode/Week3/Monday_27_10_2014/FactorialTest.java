package ua.artcode.Week3.Monday_27_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class FactorialTest {
    public static void main(String[] args) {
        int x = 5;
        int value = fact(x);
        System.out.println("!" + x + " = " + value);
    }
    public static int fact(int num){
        if(num < 2){
            return 1;
        }
        int returned = fact(num - 1);
        int res = num * returned;
        return res;
    }
}
