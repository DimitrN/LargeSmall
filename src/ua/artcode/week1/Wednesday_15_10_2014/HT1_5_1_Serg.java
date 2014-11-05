package ua.artcode.Week1.Wednesday_15_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 20.10.14
 * Time: 19:40
 * To change this template use File | Settings | File Templates.
 */
public class HT1_5_1_Serg {
    public static void main(String[] args) {
        int dec = 8;
        int div = dec;
        int mod = 0;
        String res = "";

        while (div >= 1){
            mod = div % 2;
            res = mod + res; //action
            div = div / 2; // way condition
        }
        System.out.println(res);

    }
}
