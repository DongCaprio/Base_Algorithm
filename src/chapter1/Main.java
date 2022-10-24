package chapter1;
import java.util.Scanner;

class Main {
	public String[] solution(String[] array) {
		String answer = "";
		String[] answerArray = new String[array.length];
		for (int i =0; i<array.length; i++) {
			for(int j =array[i].length(); j > 0;j--) {
				answerArray[i] += array[i].charAt(j);
			}
		}
		return answerArray;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int str = kb.nextInt();
		String [] array = new String[str];
		for(int i =0; i<str; i++) {
			array[i] = kb.nextLine();
		}
		
		System.out.println(T.solution(array));
	}
}
