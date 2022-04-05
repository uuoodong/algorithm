package programmers.search;

import java.util.*;

public class Lev2Carpet {

	class Solution {
		Map<Integer, Integer> map = new HashMap<>();

		void mak(int n) {
			for (int i = 3; i <= n / 3; i++) {
				int m = n / i;
				if (n % i == 0 && !map.containsKey(m)) {
					map.put(i, m);
				}
			}
		}

		public int[] solution(int brown, int yellow) {
			int[] answer = new int[2];
			int b = brown;
			int y = yellow;
			int mtx = brown + yellow;
			mak(mtx);
			System.out.println(map);
			map.forEach((key, value) -> {
				int g = value;
				int s = key;
				for (int i = 2; i < value; i += 2) {
					g -= i;
					for (int j = 2; j < key; j += 2) {
						s -= j;
						if (g * s == y) {
							answer[0] = value;
							answer[1] = key;
							break;
						}
					}
				}
			});

			return answer;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
