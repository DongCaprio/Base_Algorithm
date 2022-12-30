package chapter4;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main_K번째큰수 {
	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		Set<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
		for(int i =0; i<n;i++) {
			for(int j =i+1; j<n; j++) {
				for(int l = j+1; l <n; l++) {
					tSet.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int nn = 1;
		for(int x : tSet) {
			if(nn == k) answer = x;
			nn++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main_K번째큰수 T = new Main_K번째큰수();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}
}
