package interviewProgram;

import java.util.Arrays;

public class AddMatrix {
	public static void addMatrix(int[][] matrix1, int[][] matrix2) {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0; j<matrix1[i].length;j++) {
				matrix1[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0; i<matrix1.length;i++)
			System.out.println(Arrays.toString(matrix1[i]));
	}
	public static void main(String[] args) {
		int [][] matrix1= {{1,2},{3,4}};
		int[][] matrix2= {{1,2},{3,4}};
		addMatrix(matrix1, matrix2);
	}

}
