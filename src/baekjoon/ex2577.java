package baekjoon;
import java.util.Scanner;
public class ex2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a*b*c;
		String str = Integer.toString(num);
		
		for(int i=0; i<10; i++) {
			int cnt = 0;
			for(int j =0; j<str.length(); j++) {
				if((str.charAt(j) - '0') == i) {
					cnt++;
				}
				System.out.println(cnt);
			}
		}
	}
}
