package chapter1;

import java.util.Scanner;

class Main문자열압축 {
	public String solution(String str) {
		str += " ";
		String answer = "";
		int aa = 1;
		char c = ' ';
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				aa++;
			} else {
				answer += array[i];
				if (aa > 1) {
					answer += String.valueOf(aa);
				}
				aa = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main문자열압축 T = new Main문자열압축();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
