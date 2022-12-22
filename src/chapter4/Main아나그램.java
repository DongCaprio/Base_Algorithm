package chapter4;
import java.util.Arrays;
import java.util.Scanner;

class Main아나그램 {
	public String solution(String str,String str2) {
		String answer = "YES";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		for(int i =0; i<arr.length; i++) {
			if(arr[i] != arr2[i]) {
				answer = "NO";
				break;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main아나그램 T = new Main아나그램();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(T.solution(str,str2));
	}
}
