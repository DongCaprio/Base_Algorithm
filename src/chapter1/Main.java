package chapter1;
import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer = "";
		String answer3 = "";
		int a = 0;
		char[] aa = str.toCharArray();
		for(char x : aa) {
			String answer2 = "";
			if(x != ' ') {
				answer += x;
				answer2 += x;
				answer3 += x;
				if(answer2.length() > answer.length()) {
					answer = answer2;
				}
				answer2 = "";
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
