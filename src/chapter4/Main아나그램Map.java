package chapter4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main아나그램Map {
	public String solution(String str,String str2) {
		String answer = "YES";
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for(char x : str.toCharArray()) {
			hMap.put(x, hMap.getOrDefault(x, 0)+1);
		}
		for(char x : str2.toCharArray()) {
			if(!hMap.containsKey(x) || hMap.get(x) == 0) return "NO";
			else {
				hMap.put(x, hMap.get(x)-1);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main아나그램Map T = new Main아나그램Map();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		String str2 = kb.next();
		System.out.println(T.solution(str,str2));
	}
}
