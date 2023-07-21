package javaPractise;

public class ReverseOddIndexString {

	private static char charAt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="today is a very good monday";
				String[] split=str.split(" ");
				

		for(int i=0;i<split.length;i++)
		{
			//System.out.println(split[i]);
			if(i%2==0){
				String rev="";
				//System.out.println(split[i]);
//				char[] cha= split[i].toCharArray();
//				StringBuilder sb=new StringBuilder();
//				  for(int j=cha.length-1;j>=0;j--){
				for(int j=split[i].length()-1;j>=0;j--){
//				   sb.append(cha[j]);
					  rev = rev+(split[i].charAt(j));
				   // System.out.println(cha[j]);
				}
//               sb.toString();              
              // System.out.println(sb);
//              split[i]= split[i].replace(split[i], sb);
                split[i]=split[i].replace(split[i], rev);
				}
			System.out.println(split[i]);	
		}
		}

	}


