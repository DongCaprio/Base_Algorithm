package chapter2;
import java.util.Scanner;

class Main등수구하기 {
	public int[] solution(int n, int[] aa) {
		int tmp = 1;
		int[] arr = new int[n];

		for(int i =0;i<n;i++) {
			for(int j =0; j<n;j++) {
				if(aa[i] < aa[j]) {
					tmp++;
				}
				if(j == n-1) {
					arr[i] = tmp;
					tmp = 1;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Main등수구하기 T = new Main등수구하기();
		Scanner kb = new Scanner(System.in);
		int n= kb.nextInt();
		int[] aa = new int[n];
		for(int i = 0; i<n;i++) {
			aa[i] = kb.nextInt();
		}
		for(int x :T.solution(n, aa)) {
			System.out.print(x+" ");
		}
	}
}
