package chapter2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main보이는학생 {
	public int solution(int digit, List<Integer> intList) {
		String answer = "";
		int aa = 0;
		int bb = Integer.MIN_VALUE;
		for(int i = 0; i< digit; i++) {
			if(bb < intList.get(i)) {
				aa++;
				bb = intList.get(i);
			}
		}
		return aa;
	}
	
	public static void main(String[] args) {
		Main보이는학생 T = new Main보이는학생();
		Scanner kb = new Scanner(System.in);
		int digit = kb.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i =0; i< digit; i++) {
			intList.add(kb.nextInt());
		}
		System.out.println(T.solution(digit, intList));
	}
}
