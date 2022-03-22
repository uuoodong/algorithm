package programmers.stack_queue;

import java.util.*;

public class Lev2Func_Dev {

	static class Solution {
		public int[] solution(int[] progresses, int[] speeds) {
			Queue<Integer> q = new LinkedList<>();
			Queue<Integer> s = new LinkedList<>();
			List<Integer> list = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			for (int i : progresses)
				q.add(i);
			for (int i : speeds)
				s.add(i);
			int day = 1;

			while (!q.isEmpty()) {
				int size = q.size();
				if (q.peek() + (day * s.peek()) >= 100) {
					q.remove();
					s.remove();
					list.add(day);
				} else {
					day++;
				}
			}
			int cnt = 1;
			for (int i = 0; i < list.size(); i++) {
				if (i != list.size() - 1) {
					if (list.get(i) == list.get(i + 1)) {
						cnt++;
					} else {
						list2.add(cnt);
						cnt = 1;
					}
				} else {
					list2.add(cnt);
				}
			}
			int[] answer = list2.stream().mapToInt(i -> i).toArray();
			return answer;
		}
	}

	static class BestSol {
		public int[] solution(int[] progresses, int[] speeds) {
			int[] dayOfend = new int[100];
			int day = -1;
			for (int i = 0; i < progresses.length; i++) {
				while (progresses[i] + (day * speeds[i]) < 100) {
					day++;
				}
				dayOfend[day]++;
			}
			return Arrays.stream(dayOfend).filter(i -> i != 0).toArray();
		}
	}

	static class BestSol2 {
		public int[] solution(int[] progresses, int[] speeds) {
			Queue<Integer> q = new LinkedList<>();
			List<Integer> answerList = new ArrayList<>();

			for (int i = 0; i < speeds.length; i++) {
				double remain = (100 - progresses[i]) / (double) speeds[i];
				int date = (int) Math.ceil(remain);

				if (!q.isEmpty() && q.peek() < date) {
					answerList.add(q.size());
					q.clear();
				}

				q.offer(date);
			}

			answerList.add(q.size());

			int[] answer = new int[answerList.size()];

			for (int i = 0; i < answer.length; i++) {
				answer[i] = answerList.get(i);
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		Solution sol = new Solution();
		for (int i : sol.solution(progresses, speeds))	System.out.println(i);
	}

}
