package ua.artcode.week2.Wednesday_22_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 22.10.14
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = "some text 123 word";
        int len =
        str1.length();
        System.out.println("count of symbols = " + len);

        int index =3;
        char c = str1.charAt(3);
        System.out.println("char at " + index + "index = " + c);

        String splited = str1.substring(0,4);
        System.out.println("substring from [o;4) = " + splited);

        //String or char
        boolean res = str1.contains("123");
        System.out.println("str contains 123 = " + res);

        int s = str1.codePointAt(2); // вернет код элемента String под индексом 2
        System.out.println(s);

        int pos = str1.indexOf(7);
        System.out.println(pos);

        char[] mas = str1.toCharArray();

        String  op = str1.replace('t','@');
        System.out.println(op);
    }
}
