package programmers.stack_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Lev2Stock {

	static class Solution {
		public int[] solution(int[] prices) {
			int len = prices.length;
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < len; i++) {
				if (i == len - 1) {
					list.add(0);
					break;
				}
				int l = prices[i];
				int cnt = 0;
				for (int j = i + 1; j < len; j++) {
					int r = prices[j];
					if (l <= r) {
						cnt++;
					} else {
						cnt++;
						break;
					}
				}
				list.add(cnt);
			}
			int[] answer = list.stream().mapToInt(i -> i).toArray();
			return answer;
		}
	}

	static class BestSol {
		public int[] solution(int[] prices) {
			Stack<Integer> beginIdxs = new Stack<>();
			int i = 0;
			int[] terms = new int[prices.length];

			beginIdxs.push(i);
			for (i = 1; i < prices.length; i++) {
				while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
					int beginIdx = beginIdxs.pop();
					terms[beginIdx] = i - beginIdx;
				}
				beginIdxs.push(i);
			}
			while (!beginIdxs.empty()) {
				int beginIdx = beginIdxs.pop();
				terms[beginIdx] = i - beginIdx - 1;
			}

			return terms;
		}
	}

	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		Solution sol = new Solution();
		for (int i : sol.solution(prices)) System.out.println(i);

	}

}
