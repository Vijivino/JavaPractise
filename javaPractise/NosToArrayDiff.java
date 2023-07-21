package javaPractise;

import java.util.Scanner;

public class NosToArrayDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[4];
	
		//get the values from console and add into array
		Scanner sc=new Scanner(System.in);
		//int num = sc.nextInt();
		for(int i=0;i<array.length;i++) {
			 array[i] = sc.nextInt();
			//System.out.println(array[i]); 
		}
		
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}
	
		System.out.println("size of array "+array.length); //4
		int diff=array[3] - array[0];
		System.out.println("difference is "+diff);
	}
}
