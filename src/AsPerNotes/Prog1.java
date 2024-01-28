package AsPerNotes;

public class Prog1 {
	public static void main(String[] args) {
		String a="Jitendra";
		String rev="";
		
		for(int i=a.length()-1;i>=0;i--) {
			
			rev=rev+a.charAt(i);
		}
		System.out.println("The reverse string is : "+rev);
	}

}
