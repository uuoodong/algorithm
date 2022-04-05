package programmers.heap;

import java.util.*;

public class Lev2Disk {

	class Solution {
		public int solution(int[][] jobs) {
			int answer = 0;
			int len = jobs.length;
			int time = 0;
			int idx = 0;
			Queue<int[]> q = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
			Arrays.sort(jobs, Comparator.comparingInt((int[] o) -> o[0]));
			while (idx < len || !q.isEmpty()) {
				while (idx < len && jobs[idx][0] <= time)
					q.offer(jobs[idx++]);
				System.out.println(q);
				if (q.isEmpty())
					time = jobs[idx][0];
				else {
					int[] job = q.poll();
					answer += time - job[0] + job[1];
					time += job[1];
				}
			}

			return answer / len;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
