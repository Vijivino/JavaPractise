package javaPractise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AddValuesToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new LinkedHashMap<Integer,String>();
		
		map.put(100, "Viji");
		map.put(102, "laxmi");
		
		System.out.println(map);
		
		//get the input from run time
		Scanner sc =new Scanner(System.in);
		String key3=sc.next();
		int keyint = Integer.parseInt(key3);
		String val3=sc.next();
		map.put(keyint, val3);
		System.out.println(map);

	}

}
