package programmers.greedy;

import java.util.*;

public class Lev1Clothes {

	static class Solution {
		public int solution(int n, int[] lost, int[] reserve) {
			int answer = 0;
			Arrays.sort(lost);
			Arrays.sort(reserve);
			List<Integer> list = new ArrayList<>();
			for (int i : reserve)
				list.add(i);
			boolean[] c = new boolean[n];
			Arrays.fill(c, true);
			for (int i : lost) {
				if (!list.contains(i)) {
					c[i - 1] = false;
				} else {
					list.remove(Integer.valueOf(i));
				}
			}

			for (int i : list) {
				if (i != 1 && c[i - 2] == false) {
					c[i - 2] = true;
				} else if (i != n && c[i] == false) {
					c[i] = true;
				}
			}
			for (boolean i : c) {
				if (i == true)
					answer++;
			}
			return answer;
		}
	}

	public static void main(String[] args) {

	}

}
