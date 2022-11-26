package chapter2;
import java.util.Scanner;

class Main격자판최대합 {
	public int solution(int n, int[][] arr) {
		int answer = 0 , answer2 = 0;
		int real_answer = 0;
		for(int i = 0; i<n; i++) {
			for(int j =0;j<n;j++) {
					answer += arr[i][j];
					answer2 += arr[j][i];
			}
			if(real_answer <answer) {
				real_answer = answer;
			}
			if(real_answer <answer2) {
				real_answer = answer2;
			}
			answer = 0;
			answer2 = 0;
		}
		/*for(int i = 0; i<n; i++) {
			for(int j =0;j<n;j++) {
				answer += arr[j][i];
			}
			if(real_answer <answer) {
				real_answer = answer;
			}
			answer = 0;
		}*/
		for(int i = 0; i<n; i++) {
				answer += arr[i][i];
				answer2 += arr[i][n-i-1];
			if(real_answer <answer) {
				real_answer = answer;
			}
		}
		answer = 0;
		answer2 = 0;
		for(int i = 0; i<n; i++) {
			answer += arr[i][n-i-1];
			if(real_answer <answer) {
				real_answer = answer;
			}
			if(real_answer <answer2) {
				real_answer = answer2;
			}
		}
		return real_answer;
	}
	
	
	
	public static void main(String[] args) {
		Main격자판최대합 T = new Main격자판최대합();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j =0;j<n;j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
