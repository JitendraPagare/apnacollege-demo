package AsPerNotes;

public class Prog2 {
	public static void main(String[] args) {
		String str="2aa3ss5dd1ee";
		
		int sum=0;
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(Character.isDigit(str.charAt(j))) {
					sum=sum+Integer.parseInt(str.charAt(j)+"");
				}
				
			}
		}
		System.out.println(sum);
	}

}
