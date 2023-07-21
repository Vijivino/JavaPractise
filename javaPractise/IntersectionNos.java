package javaPractise;

public class IntersectionNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] set1= {50,10,70,50,90};
		int[] set2={30,10,50,90,70,80};
		
		for(int i=0;i<set1.length;i++) {
			for(int j=0;j<set2.length;j++) {
				if(set1[i]==set2[j]) {
					System.out.println(set1[i]);
				}
			}
		}

	}

}
