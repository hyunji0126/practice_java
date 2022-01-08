package array_practice;

public class array1 {

	public static void main(String[] args) {
		int[] num_a1 = new int[100];
		double[] num_a2;
		num_a2 = new double[100];
		System.out.println( num_a1[0] );	
		System.out.println( num_a2[0] );

		System.out.println("---------------------------------");

		int[] scores = new int[10];
		int s_size = scores.length;
		System.out.println( scores[0] );	// 0
		System.out.println( scores[-1] );	// ???
		// System.out.println( scores[10] ); --> error
		System.out.println( scores[s_size-1] );
		
		System.out.println("---------------------------------");

		int[] sales_table = { 55, 88, 60, 100, 90 };
		System.out.println( sales_table[1] );  
		
		int[] sales_table2 = new int[] { 55, 88, 60, 100, 90 };
		System.out.println( sales_table2[2] );
		
		System.out.println("---------------------------------");
		
		int[] ar;
		ar = new int[] {1,2,3,4,5};
		double[] ar2 = {1.1,2.2,3.3,4.4,5.5};
		
		System.out.println(ar[ar.length-1] );  
		System.out.println(ar2[ar2.length-1] );
		
		System.out.println(ar); 
		System.out.println(ar2);	
		
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
