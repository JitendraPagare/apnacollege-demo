package AsPerNotes;

public class Prog6 {
	public static void main(String[] args) {
		String str="jitendraaaaa";
		String str2="";
		
		Boolean found=false;
		for(int i =0;i<str.length();i++) {
			
			for(int j=0;j<str2.length();j++) {
				
				if (str.charAt(i)==str2.charAt(j)) {
					found=true;
					break;
				}
				if (found==false) {
					str2=str2+str.charAt(i);
				}
				
			}
		}
		System.out.println(str);
		System.out.println(str2);
	}

}
