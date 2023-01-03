package chapter5;

import java.util.Scanner;
import java.util.Stack;

class Main올바른괄호 {
	public String solution(String str) {
		String answer = "YES";
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') stack.push(arr[i]);
			if(stack.empty()) {
				return "NO";
			}
			if(arr[i] == ')') stack.pop();
		}
		if(!stack.empty()) return "NO";

		return answer;
	}

	public static void main(String[] args) {
		Main올바른괄호 T = new Main올바른괄호();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
