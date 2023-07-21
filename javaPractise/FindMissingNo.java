package javaPractise;

import java.util.Arrays;

public class FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num= {9,8,3,6,7,1,2,4};	
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i]!=(i+1)) {
				System.out.println("Missing No "+(i+1));
				break;
			}
		}
		
		
	}

}
