package chapter1;

import java.util.Scanner;

public class Main문자찾기 {

	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		//System.out.println(str+" "+t);
		for(char x : str.toCharArray()) { //향상된 for문
			if(t == x) {
				answer ++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main문자찾기 T = new Main문자찾기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
	}

}
