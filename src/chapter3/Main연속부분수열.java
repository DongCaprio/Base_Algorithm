package chapter3;
import java.util.Scanner;

class Main연속부분수열 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int real_answer = 0;
		for(int i =0; i <n; i++) {
			for(int j =0; answer <= m && i+j <n ; j++) {
				answer += arr[i+j];
				if(answer == m) real_answer++;
			}
			answer = 0;
		}
		
		return real_answer;
	}
	
	public static void main(String[] args) {
		Main연속부분수열 T = new Main연속부분수열();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,m,arr));
	}
}
