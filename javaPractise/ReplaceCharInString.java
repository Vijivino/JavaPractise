package javaPractise;

public class ReplaceCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="automation";

		for(int i=0;i<str.length();i++){
		   //if(str.charAt(i)=='a'){ //to remove only a
			   if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i'
					   ||str.charAt(i)=='o' || str.charAt(i)=='u'){ //to remove all the vowels
		    str= str.replace(str.charAt(i),' ') ;
		}
		}

		System.out.println(str);

	}

}
