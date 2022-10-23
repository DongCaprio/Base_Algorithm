package chapter1;

import java.util.Scanner;

class Main대소문자변환 {
	public String solution(String str) {
		String answer = "";
		for (char x : str.toCharArray()) {
			if (x >= 65 && x <= 90) {
				x = Character.toLowerCase(x);
				answer += x;
			} else if (x >= 97 && x <= 122) {
				x = Character.toUpperCase(x);
				answer += x;
			} else {
				answer += x;
			}

			/*	
			 		for (char xx : str.toCharArray()) {
							if (Character.isUpperCase(xx)) {
								answer += Character.toLowerCase(x);
							} else {
								answer += Character.toUpperCase(x);
							}
							
			} 
			*/
		}

		return answer;
	}

	public static void main(String[] args) {
		Main대소문자변환 T = new Main대소문자변환();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
