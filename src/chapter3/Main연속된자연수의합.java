package chapter3;
import java.util.Scanner;

class Main연속된자연수의합 {
	public int solution(int n) {
		int answer = 0, sum =0, lt = 0;
		int[] arr = new int[n/2+1];
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int rt =0; rt < arr.length; rt++) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
					if(sum == n) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main연속된자연수의합 T = new Main연속된자연수의합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
