package com.one;

import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {123,54,34,23,87,67,98};
		//Arrays.fill(numbers, 100);
		//Partial filling
				//Arrays.fill(numbers, 0, 2, 200);
				int []arr_copy=Arrays.copyOf(numbers, 7); //
				Arrays.sort(numbers);
				int index=Arrays.binarySearch(numbers, 434);
				System.out.println(index+" is the index of the desired number.");
		for(int x:numbers)
		{
			System.out.println(x);
		}
		boolean res=Arrays.equals(numbers, arr_copy);
		System.out.println(res);
		

	}

}
