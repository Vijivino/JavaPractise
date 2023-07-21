package javaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String []args) {
	int[] num= {1,7,8,9,0,3,2,1,0};
	System.out.println(num.length);
	System.out.println(num[0]);
	//sort array drirectly
	Arrays.sort(num);
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	
	//reverse this array
	for(int i=num.length;i>=0;i--) {
		System.out.println(i);
	}
	
	//sort array by passing it into arraylist
	List<Integer> list=new ArrayList<Integer>();
	
	//for(Integer e:num) {
	for(int i=0;i<=num.length;i++) {
		list.add(i);
		
	}
	
	System.out.println(list);
	Collections.sort(list); //no need to sort again using collections
	System.out.println(list);
	
	}
}
