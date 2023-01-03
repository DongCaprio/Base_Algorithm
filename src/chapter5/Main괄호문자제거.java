package chapter5;
import java.util.Scanner;
import java.util.Stack;

class Main괄호문자제거 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> st = new Stack<Character>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(st.peek() != '(') {
					st.pop();
				}
				if(st.peek() == '(') st.pop();
			} else {
				st.push(x);
			}
		}
		while(!st.empty()) {
			answer += st.pop();
		}
		StringBuffer sb = new StringBuffer(answer);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		Main괄호문자제거 T = new Main괄호문자제거();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
