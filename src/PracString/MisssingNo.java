package PracString;

import java.util.Arrays;

public class MisssingNo {
	public static void main(String[] args) {
		int a []= {5,4,9,7,8,2};
		Arrays.sort(a);
		//{2,4,5,7,8,9}
	//	System.out.println(a.length);
		for(int i=0; i<a.length;i++)
		{
			if(a[i]+1==a[i+1])
			{
				continue;
			}
			else
			{
				int missingno=a[i]+1;
				System.out.println(missingno);
			
			}
		}
	}

}
