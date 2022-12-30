package chapter4;
import java.util.HashMap;
import java.util.Scanner;

class Main모든아나그램찾기 {
	public int solution(String str, String str2) {
		int answer = 0, lt = 0;
		HashMap<Character, Integer> aa = new HashMap<>();
		HashMap<Character, Integer> aa2 = new HashMap<>();
		for(char x : str2.toCharArray()) {
			aa2.put(x, aa2.getOrDefault(x,0)+1);
		}
		char[] charArr = str.toCharArray();
		for(int i =0; i < str2.length(); i++) {
			aa.put(charArr[i], aa.getOrDefault(charArr[i], 0)+1);
		}
		for(int i = str2.length(); i <= str.length(); i++) {
			if(aa.equals(aa2)) answer++;
			if(i == str.length()) break;
			aa.put(charArr[i], aa.getOrDefault(charArr[i], 0)+1);
			aa.put(charArr[lt], aa.get(charArr[lt])-1);
			if(aa.get(charArr[lt]) == 0) aa.remove(charArr[lt]);
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main모든아나그램찾기 T = new Main모든아나그램찾기();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(T.solution(str,str2));
	}
}
