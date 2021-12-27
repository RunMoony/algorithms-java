package baekjoon;

import java.util.Scanner;
public class ex8958{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String arr[] = new String[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				}
				if (arr[i].charAt(j) == 'X') {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}