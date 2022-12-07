package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public List<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < n1; i++) {
			intList.add(arr1[i]);
		}
		for (int i = 0; i < n2; i++) {
			intList.add(arr2[i]);
		}
		Collections.sort(intList);
		return intList;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] aa = new int[n];
		for (int i = 0; i < n; i++) {
			aa[i] = kb.nextInt();
		}
		int n2 = kb.nextInt();
		int[] aa2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			aa2[i] = kb.nextInt();
		}
		for (int a : T.solution(n, aa, n2, aa2)) {
			System.out.print(a + " ");
		}
	}
}
