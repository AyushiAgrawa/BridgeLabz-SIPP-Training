package Day4_MethodProgrammingElements.Level2;
import java.util.*;
public class MatrixManipulation {

	public static void main(String[] args) {
		int size = 3;
		double[][] matrix = generateMatrix(size);
        System.out.println("Original Matrix:");
        displayMatrix(matrix);
        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));
        double det = (size == 2) ? determinant2(matrix) : determinant3(matrix);
        System.out.println("Determinant: " + det);
        System.out.println("Inverse:");
        double[][] inverse = (size == 2) ? inverse2(matrix) : inverse3(matrix);
        displayMatrix(inverse);
	}
	public static double[][] generateMatrix(int size) {
        double[][] matrix = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextInt(10); 
        return matrix;
    }
     public static double[][] transpose(double[][] matrix) {
	        int size = matrix.length;
	        double[][] transpose = new double[size][size];
            for (int i = 0; i < size; i++)
	            for (int j = 0; j < size; j++)
	                transpose[i][j] = matrix[j][i];
	        return transpose;
	 }
     public static double determinant2(double[][] m) {
         return m[0][0] * m[1][1] - m[0][1] * m[1][0];
     }
     public static double determinant3(double[][] m) {
         return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
              - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
              + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
     }
     public static double[][] inverse2(double[][] m) {
         double det = determinant2(m);
         if (det == 0) return null;
         double[][] inverse = new double[2][2];
         inverse[0][0] =  m[1][1] / det;
         inverse[0][1] = -m[0][1] / det;
         inverse[1][0] = -m[1][0] / det;
         inverse[1][1] =  m[0][0] / det;
         return inverse;
     }
     public static double[][] inverse3(double[][] m) {
         double det = determinant3(m);
         if (det == 0) return null;
         double[][] inverse = new double[3][3];
         for (int i = 0; i < 3; i++)
             for (int j = 0; j < 3; j++) {
                 double[][] minor = new double[2][2];
                 int row = 0, col;

                 for (int x = 0; x < 3; x++) {
                     if (x == i) continue;
                     col = 0;
                     for (int y = 0; y < 3; y++) {
                         if (y == j) continue;
                         minor[row][col++] = m[x][y];
                     }
                     row++;
                 }
                 double minorDet = determinant2(minor);
                 inverse[j][i] = Math.pow(-1, i + j) * minorDet / det;
             }
         return inverse;
     }
     public static void displayMatrix(double[][] m) {
         if (m == null) {
             System.out.println("Matrix is not invertible (determinant is zero).");
             return;
         }
         for (double[] row : m) {
             for (double value : row) {
                 System.out.printf("%8.2f", value);
             }
             System.out.println();
         }
     }
}
