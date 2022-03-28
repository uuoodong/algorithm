package programmers.sort;

import java.util.*;

public class Lev2Max {

	static class Solution {
		public String solution(int[] numbers) {
			List<String> list = new ArrayList<>();
			for (int i : numbers)
				list.add(Integer.toString(i));
			Collections.sort(list, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return (o2 + o1).compareTo(o1 + o2);
				}
			});
			StringBuilder as = new StringBuilder();
			for (String i : list)
				as.append(i);
			String answer = as.toString();
			return (answer.charAt(0) == '0') ? "0" : answer;
		}
	}

	static class BestSol {
		public String solution(int[] numbers) {
			String answer = "";

			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < numbers.length; i++) {
				list.add(numbers[i]);
			}
			Collections.sort(list, (a, b) -> {
				String as = String.valueOf(a), bs = String.valueOf(b);
				return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
			});
			StringBuilder sb = new StringBuilder();
			for (Integer i : list) {
				sb.append(i);
			}
			answer = sb.toString();
			if (answer.charAt(0) == '0') {
				return "0";
			} else {
				return answer;
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
