package ua.artcode;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 22.10.14
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */

public class ArrayHelper {

    // метод выводит на экран значение массива
    public static void printArr(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // метод возвращает массив случайных чисел
    public static int[] genRandomMas(int size, int range){
        int[] mas = new int[size];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random() * range);
        }
        return mas;
    }


    // метод возвращает в заданной стринге количество искомых чаров (в стринге "wwwasd" количество "w" = 3)
    public static int countChar(String src, char c){
        int count = 0;
        for(int i = 0; i < src.length(); i++){
            char spec = src.charAt(i);
            if(spec == c){
                count++;
            }
        }
        return count;
    }


    public static int genRandomNum(int lRange, int rRange){
        return lRange + (int)(Math.random() * (rRange - lRange));
    }

    // возвращает массив обрезаный по границам start и end (start end - индексы ячеек), на входе требует массив и граници, по которым надо обрезать
    public static int[] splitArray(int[] arr, int start, int end){
        int newArrSize = end-start+1;
        int [] newArr = new int[newArrSize];

        for (int  i = 0; i <newArr.length; i++){
            newArr [i] = arr[start];
            start++;
        }
        return newArr;
    }
}