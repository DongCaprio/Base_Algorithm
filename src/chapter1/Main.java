package chapter1;
import java.util.Scanner;

class Main {
	public String solution(String str) {
		String answer = "";
		for(int i =0; i<str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		String tmp = new StringBuilder(answer).reverse().toString().toUpperCase();
		if(tmp.equals(answer.toUpperCase())){
			return "YES";
		} else {
			return "NO";
		}
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
