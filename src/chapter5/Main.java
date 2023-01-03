package chapter5;
import java.util.Scanner;
import java.util.Stack;

class Main {
	public int solution(int n, int[][] intArr, int m, int[] mArr) {
		int answer = 0;
		Stack<Integer> st = new Stack<Integer>();
		for(int x : mArr) {
			for(int i =0; i<n; i++) {
				if(intArr[i][x-1] != 0) {
					int tmp = intArr[i][x-1];
					intArr[i][x-1] = 0;
					if(!st.empty() && tmp == st.peek()) {
						answer += 2;
						st.pop();
					} else {
						st.push(tmp);
						break;
					}
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[][] intArr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				intArr[i][j] = kb.nextInt();
			}
		}
		int m = kb.nextInt();
		int [] mArr = new int[m];
		for(int i =0; i<m; i++) {
			mArr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,intArr,m,mArr));
	}
}
