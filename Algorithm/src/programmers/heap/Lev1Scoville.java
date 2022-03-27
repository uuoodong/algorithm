package programmers.heap;

import java.util.*;

public class Lev1Scoville {

	class Solution {
		public int solution(int[] scoville, int K) {
			int answer = 0;
			PriorityQueue<Integer> pq = new PriorityQueue<>();

			Arrays.sort(scoville);
			for (int i : scoville)
				pq.add(i);

			while (true) {
				if (pq.peek() >= K)
					break;
				if (pq.size() == 1) {
					answer = -1;
					break;
				}
				int temp1 = pq.remove();
				int temp2 = pq.remove();
				pq.add(sol(temp1, temp2));
				answer++;
			}

			return answer;

		}

		public int sol(int a, int b) {
			return (b * 2) + a;
		}
	}

	public static void main(String[] args) {
		

	}

}
