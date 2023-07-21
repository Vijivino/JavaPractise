package javaPractise;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="$45,23,300";
		
		String strNew=str.replaceAll("\\D", "");
		System.out.println(strNew);
		int price=Integer.parseInt(strNew);
		System.out.println(str+" changed to " +price);

	}

}
