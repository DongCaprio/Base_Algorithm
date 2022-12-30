package chapter4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Main매출액의종류 {
	public List<Integer> solution(int n1, int n2, int[] arr) {
		int lt =0;
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n2-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		for(int rt = n2-1; rt<n1; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			list.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
		}
		return list;
	}
	
	public static void main(String[] args) {
		Main매출액의종류 T = new Main매출액의종류();
		Scanner kb = new Scanner(System.in);
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int[] arr = new int[n1];
		for(int i=0; i< n1; i++) {
			arr[i] = kb.nextInt();
		}
		for(int n :T.solution(n1, n2, arr)) {
			System.out.print(n+" ");
		}
	}
}
