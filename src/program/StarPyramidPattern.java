package program;

public class StarPyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//left Indentation
		leftTriangle(n);
		//Right Indentation
		rightTriangle(n);
		//center Indentation
		centerTriangle(n);
		//reverse Left Indentation 
		reverseLeftTriangle(n);
		//reverse Right Indentation
		reverseRightTriangle(n);
		//reverse Center Indentation
		reverseCenterTriangle(n);
		//Diamond
		diamond(n);
	}
	private static void diamond(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int k=0; k<=i+i;k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<=n;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=(i+i)-1;k<n+n;k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("######################################");
	}
	private static void reverseCenterTriangle(int n) {
		// TODO Auto-generated method stub
		 for(int i=0;i<=n;i++) {
			 for(int j=i;j>0;j--)
				 System.out.print(" ");
			 for(int k=(i+i)-1;k<n+n;k++)
				 System.out.print("*");
			 System.out.println();
		 }
		 System.out.println("######################################");
	}
	private static void reverseRightTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n;i++) {
			for(int j=0;j<=i;j++)
				System.out.print(" ");
			for(int k=n;k>i;k--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("######################################");
	}
	private static void reverseLeftTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("######################################");
	}
	private static void centerTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n;i++) {
			for(int j=n-1;j>i;j--)
				System.out.print(" ");
			for(int k=0; k<=(i+i);k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("######################################");
	}
	public static void leftTriangle(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("######################################");
	}
	public static void rightTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=n-1;j>i;j--)
				System.out.print(" ");
			for(int k=0;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("######################################");
	}

}
