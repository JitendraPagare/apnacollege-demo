package AsPerNotes;

public class OccOfSingleChar {
	
	public static void main(String[] args) {
		String s="AABBCCCD";
		int count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='C') {
				count++;
			}
		}
		System.out.println(count);
	}

}
