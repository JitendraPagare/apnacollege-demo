package PracString;

public class CountStrWithoutSpace {
	
	public static void main(String[] args) {
		String x="The kiran Acadamy";
		int count =0;
		for(int i=0;i<x.length();i++) {
			
			if(x.charAt(i)!=' ') {//Its a condition that doesn"t count space inside a string
				count++;
			}
		}System.out.println(count);
		
		 //?????Condition to count space only?????
			/*
			 * if(x.charAt(i)==' ') 
			 * { count++; }
			 * 
			 */
		
	             
	}
             
}
