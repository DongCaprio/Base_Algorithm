package chapter4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Main학급해장Map {
	public char solution(int n,String str) {
 		char answer = ' ';
 		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
 		for(char x : str.toCharArray()) {
 			map.put(x, map.getOrDefault(x,0)+1);
 		}
 		int max = 0;
 		for(char cc : map.keySet()) {
 			if(map.get(cc) > max) {
 				max = map.get(cc);
 				answer = cc;
 			}
 		}
		return answer;
	}
	
	public static void main(String[] args) {
		Main학급해장Map T = new Main학급해장Map();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(T.solution(n,str));
	}
}