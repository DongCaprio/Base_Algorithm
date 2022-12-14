package chapter3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main공통원소구하기 {
	public List<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
		List<Integer> intList = new ArrayList<>();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		int a1 = 0, a2 = 0;
		while(a1 < n1 && a2 < n2) {
			if(arr1[a1]<arr2[a2]) {
				a1++;
			} else if(arr1[a1] == arr2[a2]) {
				intList.add(arr1[a1]);
				a1++;
				a2++;
			}
			else {
				a2++;
			}
		}
		
		return intList;
	}
	
	public static void main(String[] args) {
		Main공통원소구하기 T = new Main공통원소구하기();
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
