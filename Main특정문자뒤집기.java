package chapter1;
import java.util.Scanner;

class Main특정문자뒤집기 {
	public String solution(String str) {
		String answer = "";
		char[] aa = str.toCharArray();
		int lt = 0, rt = aa.length-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(aa[lt])) { //알파벳이 맞는지 확인
				lt ++;
			} else if(!Character.isAlphabetic(aa[rt])) {
				rt --;
			} else {
				char cc = aa[lt];
				aa[lt] = aa[rt];
				aa[rt] = cc;
				lt ++;
				rt --;
			}
		}
		answer = String.valueOf(aa);
		return answer;
	}
	
	public static void main(String[] args) {
		Main특정문자뒤집기 T = new Main특정문자뒤집기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}
