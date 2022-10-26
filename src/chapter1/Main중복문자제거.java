package chapter1;
import java.util.Scanner;

class Main중복문자제거 {
	public String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i) { //indexOf는 문자의 첫 위치를 알려준다.
				answer += str.charAt(i);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main중복문자제거 T = new Main중복문자제거();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
