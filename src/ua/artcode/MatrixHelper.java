package ua.artcode;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:45
 * To change this template use File | Settings | File Templates.
 */
public class MatrixHelper {

    // метод выводит в консоль значения двумерного массива, на вход требует двум. массив
    public static void printMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // метод возвращает двумерный массив, на вход требует параметры двум. массива - строки и столбцы
    public static int[][] genMat(int rows, int columns){
        int[][] mat = new int[rows][columns];
        for(int i = 0; i < mat.length; i++){
            mat[i] = ArrayHelper.genRandomMas(columns, 100);
        }
        return mat;
    }

    // метод возвращает двумерный массив, заполненный "змейкой", на вход требует параметры двум. массива - строки и столбцы, и параметр "sec" - задержку вывода в консоль циклов заполнения массива
    public static int[][] genSnakeRan(int rows, int columns, int sec){
        int[][] mat = new int[rows][columns];
        for(int i = 0; i < columns; i++){
            if(i % 2 == 0){
                for(int j = 0; j < rows; j++){
                    mat[j][i] = ArrayHelper.genRandomNum(10, 100);
                    printMatrix(mat);
                    waitMethod(sec);
                }
            } else {
                for(int j = rows - 1; j >= 0; j--){
                    mat[j][i] = ArrayHelper.genRandomNum(10, 100);
                    printMatrix(mat);
                    waitMethod(sec);
                }
            }
        }
        return mat;
    }

    // метод образует задержку, на вход требует время задержки
    private static void waitMethod(long sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
