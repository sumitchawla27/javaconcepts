package others;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class ForLoopPerformanceTest
{
	private static List<Integer> list = new ArrayList<>();
	private static long startTime;
	private static long endTime;
	static
	{
		for(int i=0; i < 1_00_00_000; i++)
		{
			list.add(i);
		}
	}
	public static void main(String[] args)
	{
		//Type 1
		startTime = Calendar.getInstance().getTimeInMillis();
		for(Integer i : list)
		{
			System.out.println(i);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("For each loop :: " + (endTime - startTime) + " ms");

		//Type 2
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int j = 0; j < list.size() ; j++)
		{
			System.out.println(j);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Using collection.size() :: " + (endTime - startTime) + " ms");

		//Type 3
		startTime = Calendar.getInstance().getTimeInMillis();
		int size = list.size();
		for(int j = 0; j < size ; j++)
		{
			System.out.println(j);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Using [int size = list.size(); int j = 0; j < size ; j++] :: " + (endTime - startTime) + " ms");

		//Type 4
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int j = list.size(); j > 0 ; j--)
		{
			System.out.println(j);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Using [int j = list.size(); j > 0 ; j--] :: " + (endTime - startTime) + " ms");
	}
}