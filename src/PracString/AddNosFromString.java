package PracString;

public class AddNosFromString {
	public static void main(String[] args) {
		String s="1j2i3t4u5";
		String ss="";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if (Character.isDigit(c)) {
				ss=ss+c;
				int value = Integer.parseInt(ss);
				sum=sum+value;
				ss="";
			}
			
		}System.out.println(sum);
		
	}

}
