package chapter2;
import java.util.Scanner;

class Main {
	public int solution(int n) {
		int nn =0;
		for(int i =2; i<=n; i++) {
			if(n % i == 0) {
				nn++; 
				continue; 
			}
		}
		return nn;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
