package basicProgrames;

public class SumOfMatrics {
	public static void main(String args[]) {
		int a[][]= {{2,4,5},{6,2,3}};
		int b[][]= {{3,5,2},{1,6,2}};
		int c[][]=new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
			
	}
}
