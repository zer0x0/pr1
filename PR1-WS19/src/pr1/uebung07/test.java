package pr1.uebung07;

import java.util.Stack;

public class test {

	Stack stack = new Stack();
	int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
	//boolean[][bool = new boolean[2][4];
	public static void main(String[] args) {
		test test = new test();
		int i= 0;
		while(i<test.arr.length) {
			test.stack.add(test.arr[i]);
			i++;
		}
	}
	
//	public static void main(String[] args) {
//		int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
//		int i = 0;
//		while(i<arr.length) {
//			i+=3;
//			System.out.println(arr[i]);
//			
//		}
//		
//	}
}
