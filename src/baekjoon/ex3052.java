package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
public class ex3052 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			h.add(arr[i]%42);
		}
	System.out.println(h.size());
	}
}
