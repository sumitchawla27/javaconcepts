package others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapItertation {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a",1);
		hm.put("b",2);
		hm.put("c",3);
		hm.put("d",4);

		hm.forEach((key,value) -> System.out.println(key+" " + value));

		System.out.println("Enter your input");
		Scanner sc = new Scanner(System.in);
		int  len = sc.nextInt();
		int[] arr = new int [len];
		for (int i = 0; i<len;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
