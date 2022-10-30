package chapter1;

import java.util.Scanner;

class Main가장짧은문자거리 {
	public int[] solution(String str, char str2) {
		int[] answer = new int[str.length()];
		int a = 1000;
		for (int i = 0; i < answer.length; i++) {
			if (str.charAt(i) == str2) {
				a = 0;
				answer[i] = a;
			} else {
				a++;
				answer[i] = a;
			}
		}
		
		a= 1000;
		for (int i = answer.length - 1; i >= 0; i--) {
			if (str.charAt(i) == str2) {
				a = 0;
			} else {
				a++;
				answer[i] = Math.min(answer[i], a);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Main가장짧은문자거리 T = new Main가장짧은문자거리();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char str2 = kb.next().charAt(0);
		int[] aa = T.solution(str, str2);
		for (int i : aa) {
			System.out.print(i + " ");
		}
	}
}
