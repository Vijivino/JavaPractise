package javaPractise;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Hi there today";
		
		//using replace
		String str2=str.replaceAll(" ", "");
		System.out.println(str2);
		
		//without replace
		char[] char1=str.toCharArray();
		for(int i=0;i<char1.length;i++) {
			if(char1[i]!=' ') {
				System.out.print(char1[i]);
			}
		}
		
		

	}

}
