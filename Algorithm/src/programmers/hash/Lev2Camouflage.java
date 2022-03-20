package programmers.hash;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Lev2Camouflage {

	static class Solution {
		public int solution(String[][] clothes) {
			int answer = 1;
			Map<String, Integer> map = new HashMap<>();
			for (String[] i : clothes) {
				if (map.containsKey(i[1])) {
					map.put(i[1], map.getOrDefault(i[1], 1) + 1);
				} else {
					map.put(i[1], 1);
				}
			}

			for (int i : map.values()) {
				answer *= i + 1;
			}
			return answer - 1;
		}
	}
	
	static class BestSol {
	    public int solution(String[][] clothes) {
	        return Arrays.stream(clothes)
	                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
	                .values()
	                .stream()
	                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
	    }
	}
	
	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};		
		Solution sol = new Solution();
		System.out.println(sol.solution(clothes));
	}

}
