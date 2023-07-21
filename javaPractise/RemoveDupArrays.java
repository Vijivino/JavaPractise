package javaPractise;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {4,1,2,3,3,2};
		
		
		//only remove dups 
		Set<Integer> numset=new LinkedHashSet<Integer>();//maintains insertion order
		
		for(Integer e:num) {
			numset.add(e);
		}
		System.out.println(numset);
	
       
	  //remove dups and sort
	  Set<Integer> numSet1=new TreeSet<Integer>();
	  for(Integer e:num) {
		  numSet1.add(e);
	  }
	  System.out.println(numSet1);
}	  
}
