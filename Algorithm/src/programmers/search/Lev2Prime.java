package programmers.search;

import java.util.*;

public class Lev2Prime {

	static class Solution {
		int answer;
		boolean[] check = new boolean[10];
		ArrayList<Integer> arr = new ArrayList<>();

		void dfs(String str, String tmp, int m) {
			if (tmp.length() == m) {
				int num = Integer.parseInt(tmp);
				if (!arr.contains(num))
					arr.add(num);
				return;
			} else {
				for (int i = 0; i < str.length(); i++) {
					if (!check[i]) {
						check[i] = true;
						tmp += str.charAt(i);
						dfs(str, tmp, m);
						check[i] = false;
						tmp = tmp.substring(0, tmp.length() - 1);
					}
				}
			}
		}

		void is_prime(int n) {
			if (n == 0)
				return;
			if (n == 1)
				return;
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return;
			}
			answer++;
		}

		public int solution(String numbers) {
			String tmp = "";
			for (int i = 0; i < numbers.length(); i++) {
				dfs(numbers, tmp, i + 1);
			}
			for (int i = 0; i < arr.size(); i++) {
				is_prime(arr.get(i));
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		String numbers = "4";
		Solution sol = new Solution();
		System.out.println(sol.solution(numbers));
		
	}

}
