package chapter2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public boolean isPrime(int n) {
		if(n < 2) return false;
		for(int i=2; i*i<= n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public List<Integer> solution(int n, int[] aa) {
		List<Integer> answer = new ArrayList<Integer>();
		for(int i =0; i<n; i++) {
			int tmp = aa[i];
			int res = 0;
			while(tmp > 0) {
				int t = tmp%10;
				res = res *10+t;
				tmp = tmp / 10;
			}
			if(isPrime(res)) answer.add(res);
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
		for(int x : T.solution(n, aa)) {
			System.out.print(x+" ");
		}
	}
}
