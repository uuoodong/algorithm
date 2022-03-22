package programmers.stack_queue;

import java.util.*;

public class Lev2Truck {

	static class Solution {
		public int solution(int bridge_length, int weight, int[] truck_weights) {			
			int cnt = 0;
			List<Integer> bri = new ArrayList<>();
			List<Integer> t = new ArrayList<>();
			for (int i = 0; i < bridge_length; i++)
				bri.add(0);
			for (int i : truck_weights)
				t.add(i);

			while (!t.isEmpty()) {
				bri.remove(0);
				if (bri.stream().mapToInt(Integer::intValue).sum() + t.get(0) <= weight) {
					bri.add(t.remove(0));
				} else {
					bri.add(0);
				}
				cnt++;
			}
			return cnt + bridge_length;
		}
	}

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6}; 
		Solution sol = new Solution();
		System.out.println(sol.solution(bridge_length, weight, truck_weights));
	}

}
