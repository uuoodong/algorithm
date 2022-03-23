package programmers.stack_queue;

import java.util.*;

public class Lev2Printer {

	static class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			Queue<Integer> q = new LinkedList<>();
			PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

			for (int i = 0; i < priorities.length; i++) {
				q.offer(i);
			}
			for (int i : priorities)
				p.offer(i);

			while (!p.isEmpty()) {
				int index = q.peek();
				int value = priorities[index];
				int max = p.peek();
				if (value != max) {
					q.offer(q.poll());
				} else if (value == max) {
					answer++;
					p.poll();
					q.poll();
					if (location == index) {
						return answer;
					}
				}
			}
			return answer;
		}
	}

	static class BestSol {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			int l = location;

			Queue<Integer> que = new LinkedList<Integer>();
			for (int i : priorities) {
				que.add(i);
			}

			Arrays.sort(priorities);
			int size = priorities.length - 1;

			while (!que.isEmpty()) {
				Integer i = que.poll();
				if (i == priorities[size - answer]) {
					answer++;
					l--;
					if (l < 0)
						break;
				} else {
					que.add(i);
					l--;
					if (l < 0)
						l = que.size() - 1;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		Solution sol = new Solution();
		System.out.println(sol.solution(priorities, location));
	}

}
