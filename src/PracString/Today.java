
//WAP to swap highest and lowest in an array without sorting?
package PracString;


public class Today {
	public static void main(String[] args) {
		int a []= {20,40,5,60,15};
		int max=0;
		int maxindex=0;
		int min=0;
		int minindex=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				maxindex=i;

			}
		}
		System.out.println(max);
		System.out.println(maxindex);
		min=max;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min=a[i];
				minindex=i;

			}

		}
		System.out.println(min);
		System.out.println(minindex);
		int temp;
		temp=a[maxindex];
		a[maxindex]=a[minindex];
		a[minindex]=temp;
		for(int aa:a)
		{
			System.out.print(aa+ " ");
		}








	}

}
