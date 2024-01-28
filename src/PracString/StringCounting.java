

// WAP to count cap,small letter, numbers, special symbol inside a given string
package PracString;


public class StringCounting {
	
     public static void main(String[] args) {
		String s = "Well C@me To Nashik 422010";
		int len = s.length();
		char c;  //This variable is for extraction purpose
		int capL=0, smL=0, num=0,splSy=0, space=0;
		int i;
		for(i=0; i<len;i++) {
			
			c=s.charAt(i);
			if (c>='A' && c<='Z')
				capL++;
			else if(c>='a' && c<='z')
			    smL++;
			else if (c>='0' && c<='9')
				num++;
			else if (c==' ')
				space++;
			else
				splSy++;
			
		}
		
		System.out.println("No of capital letter are"+ " " +capL);
		System.out.println("no of small letter are" + " "+smL);
		System.out.println("Number Count is:" +num);
		System.out.println("No of Space are as follow" +space);
		System.out.println("No of special charcter are:" +"   "+splSy);
	}

}
