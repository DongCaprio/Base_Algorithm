package chapter2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main큰수출력하기 {
	public List<Integer> solution(int digit, List<Integer> intList) {
		String answer = "";
		List<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(intList.get(0));
		for (int i = 1; i < intList.size(); i++) {
			if(intList.get(i) > intList.get(i-1)) {
				intList2.add(intList.get(i));
			}
		}
		return intList2;
	}
	
	public static void main(String[] args) {
		Main큰수출력하기 T = new Main큰수출력하기();
		Scanner kb = new Scanner(System.in);
		int digit = kb.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i =0; i< digit; i++) {
			intList.add(kb.nextInt());
		}
		List<Integer> aa = T.solution(digit, intList);
		for(int a : aa) {
			System.out.print(a +" ");
		}
	}
}
