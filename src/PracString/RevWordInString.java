package PracString;

public class RevWordInString {
	public static void main(String[] args) {
		String s="My Name Is Jitu";
		String RevStr="";
		//we splitted the string on the basis of space and stored it into an string array a
		String a[]=s.split(" ");


		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		/*for(int i=a.length-1;i>=0;i--) {  //Rev for loop to print an string ulti and appended with space
			System.out.print(a[i]+ " ");
		}*/ //OR

		for(int i=a.length-1;i>=0;i--) {
			RevStr=RevStr+a[i]+" ";
		}
		System.out.println(RevStr);
	}

}
