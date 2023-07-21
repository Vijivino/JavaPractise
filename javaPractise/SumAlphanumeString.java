package javaPractise;

public class SumAlphanumeString {
	public static void main(String[] args) {


		String str="abc15";
		int sum=0;
		int chSum=0;

		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum+Character.getNumericValue(ch);
				//sum=sum+ch;
//				str=str.replace(ch, ' ');
			}else {	
				chSum=chSum+ch;
			}
		}

//		System.out.println(str);
		System.out.println("Integer sum is "+sum);
		System.out.println("Character sum is "+chSum);
		System.out.println("Total is "+(sum+chSum));
	}
}
