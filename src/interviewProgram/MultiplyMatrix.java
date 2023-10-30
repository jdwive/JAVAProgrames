package interviewProgram;

import java.util.Arrays;

public class MultiplyMatrix {
	public static void multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		for(int i=0; i<matrix1.length;i++) {
			for(int j=0; j<matrix1[i].length;j++)
				matrix1[i][j]=matrix1[i][j]*matrix2[i][j];
		}
		for(int i=0; i<matrix1.length;i++)
			System.out.println(Arrays.toString(matrix1[i]));
	}
	public static void main(String[] args) {
		int[][] matrix1= {{1,2,3},{4,5,6}};
		int[][] matrix2= {{11,12,13},{14,15,16}};
		multiplyMatrix(matrix1, matrix2);
	}

}
