package chapter2;
import java.util.Scanner;

class Main봉우리 {
	public int solution(int n, int[][] arr) {
		int answer = 0; 
		for(int i = 1; i < n+1; i++) {
			for(int j =1; j<n+1;j++) {
				if((arr[i][j] > arr[i-1][j]) && (arr[i][j] > arr[i][j-1]) 
						&& (arr[i][j] >arr[i+1][j]) && (arr[i][j] >arr[i][j+1])) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main봉우리 T = new Main봉우리();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] arr = new int[n+2][n+2];
		for(int i = 1; i < n+1; i++) {
			for(int j =1; j<n+1;j++) {
				arr[i][j] = kb.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
