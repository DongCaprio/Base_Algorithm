package chapter1;

import java.util.Scanner;

class Main회문문자열 {
	public String solution(String str) {
		String answer = "";
		/*
		String up = str.toUpperCase();
		char[] aa = up.toCharArray();
		int lt = 0, rt = aa.length-1;
		while(lt < rt) {
			char c = aa[lt];
			aa[lt] = aa[rt];
			aa[rt] = c;
			lt++;
			rt--;
		}
		if(String.valueOf(aa).equals(up)) {
			return "YES";
		} else {
			return "NO";
		}
		*/
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equalsIgnoreCase(tmp)) {
			return "YES";
		} else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		Main회문문자열 T = new Main회문문자열();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
