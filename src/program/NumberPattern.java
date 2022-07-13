package program;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		/*Pattern
		 * 11111 
		 * 12222 
		 * 12333 
		 * 12344 
		 * 12345
		 */
		numberSeries(n);
		  /*1
		   121
		  12321
		 1234321
		123454321*/
		numberPyramid(n);
/*1
22
333
4444
55555*/
		sameNumberPattern(n);
/*1
12
123
1234
12345
1234
123
12
1*/
	numberPatternHalfTriangle(n);
/*
12345
1234
123
12
1

1
12
123
1234
12345
 */
	numberPatternHalfReverseTriangle(n);
/*
1
01
101
0101
10101
*/
	zeroOneTriangle(n);
/*
1
23
456
78910
 */
	oneToTenNumberSeries(n);
/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 */
	seriesCompleteTriangle(n);
/*
1****
12***
123**
1234*
12345
 */
	numberStarPattern(n);
/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
	numberSequencePattern(9);
/*
11111
11122
11333
14444
55555
 */
	numberPattern(n);
/*
 1  2  3  4  5 
 2  3  4  5  1 
 3  4  5  1  2 
 4  5  1  2  3 
 5  1  2  3  4 
 */
	numberPatternIteration(n);
/*
111112
322222
333334
544444
555556
 */
	numberPatternDifferent(n);
	}

	private static void numberPatternDifferent(int n) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1;i<=n;i++){			
			if(i%2==0)
				System.out.print(++num);
			for(int j=1;j<=n;j++)				
				System.out.print(i);
			num=i+1;
			if(i%2!=0)
				System.out.print(num);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberPatternIteration(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++)
				System.out.print(j+" ");
			for(int k=1;k<i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberPattern(int n) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1; i<=n;i++) {			
			for(int j=i;j<n;j++) {
				System.out.print("1");
			}
			for(int k=i;k>0;k--)
				System.out.print(i);
			System.out.println();
			
		}
		System.out.println("######################################");
	}

	private static void numberSequencePattern(int n) {
		// TODO Auto-generated method stub
		int temp=0;		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			int num=n,a=i;			
			for(int j=1;j<i;j++) {
				temp=a+(--num);
				System.out.print(temp+" ");
				a=temp;
			}
			System.out.println();
		}
		System.out.println("************************");
		///////
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=num+n-j;
			}
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberStarPattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print(j);
				else
					System.out.print("*");				
			}
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void seriesCompleteTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n;i++) {
			for(int j=n;j>i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void oneToTenNumberSeries(int n) {
		// TODO Auto-generated method stub
		int temp=1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(temp++);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void zeroOneTriangle(int n) {
		// TODO Auto-generated method stub		
		for(int i=2; i<=n+1;i++) {
			int temp=i%2;
			for(int j=1;j<i;j++) {				
				if(temp==1) {
					temp=0;
					System.out.print(temp);					
				}
				else if(temp==0) {
					temp=1;
					System.out.print(temp);					
				}			
			}
			System.out.println();	
		}
		System.out.println("######################################");
	}

	private static void numberPatternHalfReverseTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberPatternHalfTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
			}
		for(int i=n;i>1;i--) {
			for(int j=1;j<i;j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void sameNumberPattern(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(i);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberPyramid(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n;i++) {
			for(int j=n; j>i;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			for(int l=i-1;l>0;l--)
				System.out.print(l);
			System.out.println();
		}
		System.out.println("######################################");
	}

	private static void numberSeries(int n) {
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=i)
					System.out.print(j);
				else
					System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("######################################");
	}

}
