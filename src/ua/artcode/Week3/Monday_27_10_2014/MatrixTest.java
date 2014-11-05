package ua.artcode.Week3.Monday_27_10_2014;
import ua.artcode.MatrixHelper;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 28.10.14
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
public class MatrixTest {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[][] mat1 = new int[2][3];
        mat1[0][0] = 78;
        int val = mat1[1][1];
        int len1 = mat1.length;
        int len2 = mat1[0].length;
        int[][] mat2 = MatrixHelper.genMat(5, 5);
        MatrixHelper.printMatrix(mat2);
    }
}
