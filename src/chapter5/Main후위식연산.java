package chapter5;
import java.util.Scanner;
import java.util.Stack;

class Main후위식연산 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) st.push(Character.getNumericValue(x));
			else { 
				int rt = st.pop();
				int lt = st.pop();
				if(x == '+') st.push(lt+rt);
				else if (x == '-') st.push(lt-rt);
				else if (x == '*') st.push(lt*rt);
				else if (x == '/') st.push(lt/rt);
			}
		}
		answer = st.pop();
		return answer;
	}
	
	public static void main(String[] args) {
		Main후위식연산 T = new Main후위식연산();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
