package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
public class ex10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int many = sc.nextInt();
		int[] arr = new int[many];
		for(int i=0; i<many; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[many-1]);
	}

}
