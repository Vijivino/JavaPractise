package javaPractise;

public class RemoveDupInSenten {
	
	public static void main(String args[]) {
		
		String str="We love java so we practise java so as to excel in java";
		String[] split=str.split(" ");
		
		for(int i=0;i<split.length;i++) {
//			int count=0;
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					split[i]=split[i].replace(split[i], "");
//					count++;
					}
				}
//			if(count>=1) {
//				split[i]=split[i].replace(split[i], "");
//		     }
			
		}
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]+" ");
		}
		
	}

}
