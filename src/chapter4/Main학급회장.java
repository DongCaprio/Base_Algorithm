package chapter4;
import java.util.Scanner;

class Main학급회장 {
	public char solution(int n,String str) {
 		char answer = 'A';
		int[] intArr = new int[5];
		char[] charArr = str.toCharArray();
		int max = 0;
		int real_max = 0;

		for(char c : charArr) {
			if(c == 'A') intArr[0] ++;
			if(c == 'B') intArr[1] ++;
			if(c == 'C') intArr[2] ++;
			if(c == 'D') intArr[3] ++;
			if(c == 'E') intArr[4] ++;
		}
		for(int i =0; i< intArr.length; i++) {
			max = Math.max(max, intArr[i]);
			if(intArr[i] == max) real_max = i;
		}
		
		return (char)(answer+real_max);
	}
	
	public static void main(String[] args) {
		Main학급회장 T = new Main학급회장();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n,str));
	}
}
