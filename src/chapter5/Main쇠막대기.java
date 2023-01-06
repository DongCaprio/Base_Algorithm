package chapter5;

import java.util.Scanner;
import java.util.Stack;

class Main쇠막대기 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(')
				st.push(str.charAt(i));
			else {
				if (!st.empty() && str.charAt(i - 1) == '(') {
					st.pop();
					answer += st.size();
				} else {
					st.pop();
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main쇠막대기 T = new Main쇠막대기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
