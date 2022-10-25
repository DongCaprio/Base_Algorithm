package chapter1;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public ArrayList<String> solution(int n,String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		/*for (String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}*/
		for(String x : str) {
			char[] aa = x.toCharArray();
			int lt = 0, rt = aa.length-1;
			while(lt <rt) {
				char tmp = aa[lt];
				aa[lt] = aa[rt];
				aa[rt] = tmp;
				lt ++;
				rt --;
			}
			answer.add(String.valueOf(aa)); //char배열을 String으로 바꾸기 -> String.valueOf(배열);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i =0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
	}
}
