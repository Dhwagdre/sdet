package JavaActivity1.java.activity;

import java.util.Arrays;
public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 10, 20, 11,10}; 
		int searchNum = 10;
		int sumNum = 30;
		System.out.println(result(array, searchNum, sumNum));	
	}
	public static boolean result(int[] arrays, int searchNum, int sumNum)
	{
		int sum = 0;
		for(int number : arrays)
		{
		if(number==searchNum)
			{
			sum+=searchNum;
			}
		if(sum>sumNum)
			{
				break;
			}
		}
		return sum==sumNum;
		
	}
}