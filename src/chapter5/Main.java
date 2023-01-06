package chapter5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public String solution(String need, String plan) {
		String answer = "";
		Queue<Character> Q = new LinkedList<>();
		for(char x : need.toCharArray()) {
			Q.offer(x);
		}
		for(int i =0; i<plan.length(); i++) {
			need.charAt(i);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(T.solution(str,str2));
	}
}
