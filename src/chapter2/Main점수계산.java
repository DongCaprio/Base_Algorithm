package chapter2;
import java.util.Scanner;

class Main점수계산 {
	public int solution(int n,int[] aa) {
		int answer = 0;
		int real_answer = 0;
		for(int i =0; i<n;i++) {
			if(aa[i] == 1) {
				answer ++;
				real_answer += answer;
			} else {
				answer = 0;
			}
		}
		return real_answer;
	}
	
	public static void main(String[] args) {
		Main점수계산 T = new Main점수계산();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[] aa = new int[n];
		for(int i = 0; i<n;i++) {
			aa[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,aa));
	}
}
