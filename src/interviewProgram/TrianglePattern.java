package interviewProgram;

public class TrianglePattern {
	public static void leftStarTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int k=0;k<=i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void rightStarTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	public static void simpleStraTriangle(int num) {
		for(int i=0; i<num;i++) {
			for(int j=num-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i+i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void reverseLeftTriangel(int num) {
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void reverseRightTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<num;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void reverseSimpleTriangle(int num) {
		for(int i=0; i<=num;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=(num*2)-i;k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void diamondShape(int num) {
		for(int i=0;i<num;i++) {
			for(int j=i;j<num;j++)
				System.out.print(" ");
			for(int k=0;k<=(i+i);k++)
				System.out.print("*");			
			System.out.println();			
		}
		for(int i=0;i<=num;i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=i;k<=num*2-i;k++)
				System.out.print("*");
			System.out.println();
		}
			
	}
	public static void main(String[] args) {
		//leftStarTriangle(5);
		//rightStarTriangle(5);
		//simpleStraTriangle(5);
		//reverseLeftTriangel(5);
		//reverseRightTriangle(5);
		//reverseSimpleTriangle(5);
		diamondShape(5);
	}

}
