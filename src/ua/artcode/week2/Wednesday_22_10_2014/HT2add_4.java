package ua.artcode.week2.Wednesday_22_10_2014;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.11.14
 * Time: 12:19
 * To change this template use File | Settings | File Templates.
 */
public class HT2add_4 {

    // Инвертировать массив
    public static int[] invertMat (int [] arr){
        int [] invertMas = new int[arr.length];
        for (int i = 0;i < arr.length; i++ ){
            invertMas [i] = arr [arr.length-1-i];
        }
        return invertMas;
    }


    //Проверить является ли число простым
    public  static boolean simpleDigit (int digit){
        boolean Simple = true; // предполодим что наше число простое, а далее это будем проверять
        for (int i = 2 ; i < digit ; i++  ){
            if (digit%i ==0){
                Simple = false;
            }
        }
        return Simple;
    }

    //Есть два числа, найти их наибольший общий делитель

    public static int commonDivider (int a, int b){
        int common = 0;
        int maxAB = Math.max(a,b);
        int minAB = Math.min(a,b);

        for (common = minAB; common>0; common--){
            if (a%common==0 && b%common==0){
                common = common;
                break;
            }
        }
        return common;
    }


    //Сдвинуть массив на заданное количество позиций вправо

    public static int [] arrMove (int[] arr, int moveVelue){
        int [] newMas = new int[arr.length];
        for (int i = moveVelue,i2 = 0; i<arr.length; i++, i2++){
            newMas[i] = arr[i2];
        }
        for (int i = 0,i2 = arr.length-moveVelue; i<moveVelue; i++, i2++){
            newMas[i] = arr[i2];
        }
        return newMas;
    }
}



