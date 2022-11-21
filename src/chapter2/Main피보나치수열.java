package chapter2;
import java.util.Scanner;

class Main피보나치수열 {
	public int[] solution(int n) {
		String answer = "";
		int[] aa = new int[n];
		aa[0] = 1;
		aa[1] = 1;
		for(int i = 2; i<n; i++) {
			aa[i] = aa[i-1] + aa[i -2];
		}
		return aa;
	}
	
	public static void main(String[] args) {
		Main피보나치수열 T = new Main피보나치수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		for(int x : T.solution(n)) {
			System.out.print(x+" ");
		}
	}
}
