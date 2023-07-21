package javaPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="automation testing";

//		//Enter the input string from console
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your string here");
//		String str=sc.next();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<str.length();i++) {
			//if we want to ignore the space count
			if(!String.valueOf(str.charAt(i)).isBlank()) { //if string value is not blank then go further
                //if the map has the character(key) 
				if(map.containsKey(str.charAt(i))) {
					//then increase the integer(value) of the map +1
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}
				else {
					//else simply add the characeter as key and 1 as integer value
					map.put(str.charAt(i), 1);
				}
			}
		}

		System.out.println(map);

	}

}
