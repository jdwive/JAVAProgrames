package program;

public class DefaultArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iarr[]=new int[5];
		for(int i:iarr)
			System.out.println("Intvalue: "+i);
		
		double darr[]=new double[5];
		for(double d:darr)
			System.out.println("Doublevalue: "+d);
		
		String sarr[]=new String[5];
		for(String s:sarr)
			System.out.println("Stringvalue: "+s);
		
		DefaultArrayValue dvarr[]=new DefaultArrayValue[5];
		for(DefaultArrayValue d:dvarr)
			System.out.println("Objvalue: "+d);
		
	}

}
