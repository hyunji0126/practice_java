package array_practice;

import java.util.Arrays;

public class array2 {

	public static void main(String[] args) {

		int[] arr = { 238, 483, 239, 442, 487, 239, 873 };

		System.out.println( Arrays.toString(arr) );  
		// [] 괄호의 형태로 배열 표시를 보여주면서 출력 됨.
		System.out.println(arr[0]); 

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}

		System.out.println("------------------------------");

		int[] a,b,c;

		int d[],e[],f[];

		int g[],h,i;

		a = new int[3];
		b = new int[3];
		c = new int[3];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

		d = new int[6];
		e = new int[6];
		f = new int[6];
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));

		g = new int[9];
		h = 100;
		i = 200;
		System.out.println(Arrays.toString(g));
		System.out.println(h);
		System.out.println(i);
		//h와 i는 배열 x
	}

}
