
public class Demo1D {
	
	public static void main(String[] args)
	{
		int []numbers;
		numbers=new int[5];
		numbers[0]=100;
		numbers[1]=300;
		numbers[2]=220;
		numbers[3]=100;
		numbers[4]=456;
		//numbers[5]=654;
		System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[4]+numbers[3]);
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum+=numbers[i];
		}
		System.out.println("the sum of these numbers is "+sum+"\n");
		for (int x:numbers)
		{
			sum+=x;
		}
		System.out.println("twice the sum of these numbers is "+sum+"\n");
	}
	

}