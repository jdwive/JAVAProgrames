package interviewProgram;

import java.util.Arrays;

public class TransposeMatrix {
	public static void transposeMatrix(int[][] matrix) {
		int [][]tempMatrix= new int[matrix[0].length][matrix.length];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				tempMatrix[j][i]=matrix[i][j];
			}			
		}
		for(int i=0; i<tempMatrix.length;i++)
			System.out.println(Arrays.toString(tempMatrix[i]));
	}
	private static void transposeStringMatrix(String[][] strMatrix) {
		String[][] tempMatrix=new String[strMatrix[0].length][strMatrix.length];
		for(int i=0;i<strMatrix.length;i++) {
			for(int j=0;j<strMatrix[0].length;j++)
				tempMatrix[j][i]=strMatrix[i][j];
		}
		for(int i=0;i<tempMatrix.length;i++)
			System.out.println(Arrays.toString(tempMatrix[i]));
		
	}
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3},{4,5,6}};
		String[][]strMatrix= {{"Kuhu", "Pihu"},{"Hrutvy","Helisha"},{"Sonu","Ashu"}};
		transposeMatrix(matrix);
		transposeStringMatrix(strMatrix);
	}
	
}
