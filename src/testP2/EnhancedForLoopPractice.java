package testP2;

import java.util.ArrayList;

public class EnhancedForLoopPractice {

	public static void main(String[] args) {
		
		/// 1D ARRAY OF Integer ////

		int[] arr = { 1, 2, 3, 4, 5 };
		int Sum = 0;
		String[] arr2 = { "str1", "str2", "str3", "str4" };

		for (int n : arr) {

			System.out.println(n);
			Sum += n;
		}
		System.out.println("Sum is " + Sum + "\n");

		/// 1D ARRAY OF STRINGS ////
		
		for (String str : arr2) {
			System.out.println(str);
		}
		
		
		/// 1D ARRAY OF STRINGS ////
		
		System.out.println("\nTesting with 2D Arrays");
		
		int[][] twoDarr = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		for(int[] i: twoDarr ) {
			
			for(int j: i)
			System.out.print(j+ " ");
			System.out.println();
		}
		
		
		/// ARRAYLIST OF INTEGERS ////
		
		System.out.println("\nArray lists");
		ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		
		for(int n: arrList) {
			System.out.println(n);
		}
		
		/// ARRAYLIST OF STRINGS ////

		
		ArrayList<String> arrList2 = new ArrayList<>();
		
		arrList2.add("Str1");
		arrList2.add("Str2");
		arrList2.add("Str3");
		arrList2.add("Str4");
		
		for(String s:arrList2) {
			System.out.println(s);
		}
		
		
		arrList.get(2);
		System.out.println("\nvalue at index 2 for arrLisr "+arrList.get(3));
		
	}
	

}
