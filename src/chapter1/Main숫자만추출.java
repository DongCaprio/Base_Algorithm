package chapter1;

import java.util.Scanner;

class Main숫자만추출 {
	public Integer solution(String str) {
		String answer = "";
		/*
		String change = str.replaceAll("[^0-9]", "");
		int change2 = Integer.parseInt(change);
		String change3 = Integer.toString(change2);
		for (int i = 0; i < change3.length(); i++) {
			answer += change3.charAt(i);
		}
		if(answer.length() > 8) {
			answer.substring(7);
		}
		return Integer.parseInt(answer);
		*/
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Main숫자만추출 T = new Main숫자만추출();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
