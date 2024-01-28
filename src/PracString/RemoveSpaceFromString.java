
//WAP Program to replace All space from String--"This    is String   Remember"
package PracString;

public class RemoveSpaceFromString {
	public static void main(String[] args) {
		String s = "This    Is String   Remember";
		
		//s=s.replaceAll("\\s", ""); // Regex mtd ahe 
		s=s.replace(" ", "");
		
		System.out.println(s);
		
		//Note TRIM mtd string chya Addhi and nantr chi space remove karte
		// i.e remove starting and trailing spaces from a string
		
		String j="   Nsk 422010   ";
		j=j.trim();
		System.out.println(j);
		
		
	}

}
