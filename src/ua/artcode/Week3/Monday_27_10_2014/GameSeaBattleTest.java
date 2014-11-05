package ua.artcode.Week3.Monday_27_10_2014;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:57
 * To change this template use File | Settings | File Templates.
 */
public class GameSeaBattleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input field size");
        int size = sc.nextInt();
        char gradSymb = '+';
        char[][] field = SeaBattle.genSeaField(size, gradSymb);
        char targetSymb = '0';
        int[] targetPoints = SeaBattle.setTarget(field, targetSymb);
        int targetI = targetPoints[0];
        int targetJ = targetPoints[1];
        int i = 0;
        int j = 0;
        do{
            System.out.println(SeaBattle.drawField(field, targetSymb, gradSymb));
            System.out.println("Input line number i = ");
            i = sc.nextInt();
            System.out.println("Input column number j = ");
            j = sc.nextInt();
            String helpMessage = SeaBattle.help(i, j, targetI, targetJ);
            System.out.println(helpMessage);
        } while (!SeaBattle.isShooted(field, targetSymb, i, j));
        System.out.println("YOU WON!");
        System.out.println(SeaBattle.drawField(field, targetSymb, gradSymb));
    }
}
