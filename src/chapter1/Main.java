package chapter1;
import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(x >= 65 && x <= 90) {
				x = Character.toUpperCase(x);
				answer += x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
