package chapter2;
import java.util.Scanner;

class Main {
	public int solution(int n, int[] aa) {
		int answer = 0;

        while (n != 0) {
            answer = answer * 10 + n % 10;
            n /= 10;
            if(n == 0) answer = 0;
        }
        
        
        return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] aa = new int[n];
		for(int i =0; i<n;i++) {
			aa[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, aa));
	}
}
