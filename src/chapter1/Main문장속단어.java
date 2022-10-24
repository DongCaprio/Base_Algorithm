package chapter1;
import java.util.Scanner;

class Main문장속단어 {
	public String solution(String str) {
		String answer = "";
		String[] array = str.split(" ");
		for (String word : array) {
			if(answer.equals("")) {
				answer = word;
			}
			if(word.length() > answer.length()) {
				answer = word;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main문장속단어 T = new Main문장속단어();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
	}
}
