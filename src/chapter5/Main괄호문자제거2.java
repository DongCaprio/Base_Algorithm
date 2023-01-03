package chapter5;
import java.util.Scanner;
import java.util.Stack;

class Main괄호문자제거2 {
	public String solution(String str) {
		String answer = "";
		Stack<Character> st = new Stack<Character>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(st.pop() != '(');
			} else {
				st.push(x);
			}
		}
		for(int i =0; i<st.size(); i++) answer+= st.get(i);
		return answer;
	}
	
	public static void main(String[] args) {
		Main괄호문자제거2 T = new Main괄호문자제거2();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
