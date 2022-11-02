package chapter1;
import java.util.Scanner;

class Main {
	public String solution(int di, String str) {
		String answer = "";
		char[] array = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (array[i] == '#') {
				array[i] = '1';
			} else if (array[i] == '*') {
				array[i] = '0';
			}
		}
		int aa = 0;
		String str2 = "";
		for (int i = 0; i < di; i++) {
			for (int j = 0; j < 7; j++) {
				str2 += array[aa];
				aa++;
			}
			char bb = (char) Integer.parseInt(str2, 2);
			answer += bb;
			str2 = "";
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int di = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(di, str));
	}
}