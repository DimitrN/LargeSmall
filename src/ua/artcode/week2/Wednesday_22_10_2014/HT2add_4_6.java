package ua.artcode.week2.Wednesday_22_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.11.14
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class HT2add_4_6 {
    public static void printTree(int deep){
        char [][] mas = new char[deep][deep*2-1];
        for (int  i = 0; i<mas.length; i++){
            if (i%2==0){
                for (int j =0; j<mas[i].length; j+=1){
                    if (j%2==0){
                        mas [i][j] = '*';
                        //mas [i][deep] = '*';
                        System.out.print(mas[i][j] + " ");
                    }
                    else {mas [i][j] = ' ';
                        System.out.print(mas[i][j] + " ");
                    }
                }
            System.out.println();
            }else {
                for (int j =1; j<mas[i].length; j++){
                    if (j%2==0){
                        mas [i][j] = '*';
                        System.out.print(mas[i][j] + " ");
                    }
                    else {
                        mas [i][j] = ' ';
                        System.out.print(mas[i][j] + " ");
                    }
                }
            System.out.println();
            }
        }
    }


    public static void printTreeString(int deepString){
        for (int a = 0; a<deepString; a++){
            for (int b = 0; b<(deepString*2-1);b++){
                if (b==deepString || b==deepString-a || b==deepString+a){
                    System.out.print("*");
                }
                System.out.println("*");
            }
            System.out.print("-");
        }
        System.out.println(" ");
    }
}

