package chapter2;

import java.util.Scanner;

class Main임시반장정하기 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int real_answer = 0;

		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
				if (cnt > answer) {
					answer = cnt;
					real_answer = i;
				}
			}
		}
		return real_answer;
	}

	public static void main(String[] args) {
		Main임시반장정하기 T = new Main임시반장정하기();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n + 1][5 + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
