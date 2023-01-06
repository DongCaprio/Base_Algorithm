package chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main교육과정설계 {
	public int solution(int n, int k) {
		Queue<Integer> qu = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			qu.offer(i);
		}
		while (qu.size() > 1) {
			for (int i = 0; i < k; i++) {
				if (i == k - 1) {
					qu.poll();
				} else {
					int aa = qu.poll();
					qu.offer(aa);
				}
			}
		}

		return qu.peek();
	}

	public static void main(String[] args) {
		Main교육과정설계 T = new Main교육과정설계();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
