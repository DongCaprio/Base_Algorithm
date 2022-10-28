package chapter1;
import java.util.Scanner;

class Main유효한팰린드롬 {
	public String solution(String str) {
		
		//str.toUpperCase().replaceAll("[^A-Z]", "");
		//str에서 A부터Z를 제외하고는 "" 빈값으로 변경하는 메소드.
		
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
		Main유효한팰린드롬 T = new Main유효한팰린드롬();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
