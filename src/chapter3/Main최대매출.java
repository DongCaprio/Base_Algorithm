package chapter3;
import java.util.Scanner;

class Main최대매출 {
	public int solution(int n, int answerN, int[] arr) {
		int answer = 0;
		int real_answer = 0;
		for(int i=0; i<answerN; i++) {
			answer += arr[i];
		}
		real_answer = answer;
		for(int i=0; i<n-answerN; i++) {
		 answer =answer+arr[i+answerN]-arr[i];
		 if(answer > real_answer) real_answer = answer;
		}
		return real_answer;
	}
	
	public static void main(String[] args) {
		Main최대매출 T = new Main최대매출();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
 		int answerN = kb.nextInt();
 		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, answerN, arr));
	}
}
