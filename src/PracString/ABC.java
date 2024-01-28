package PracString;

public class ABC {
	public static void main(String[] args) {
		String s="Jitendra Rajendra Pagare";
		String revs=" ";
		
		String words[]=s.split("\\s");
		for (String w : words) {
			StringBuilder sb =new StringBuilder(w);
			sb.reverse();
			revs=revs+sb.toString()+" ";
		}
		
		System.out.println(revs);
		
	}

}
