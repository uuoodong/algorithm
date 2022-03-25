package programmers.sort;

import java.util.*;

public class Lev1Knumber {

	static class Solution {
		public int[] solution(int[] array, int[][] commands) {
			List<Integer> list = new ArrayList<>();
			List<Integer> q = new ArrayList<>();
			for (int[] i : commands) {
				int k = i[2];
				for (int j = i[0] - 1; j < i[1]; j++) {
					list.add(array[j]);
				}
				Collections.sort(list);
				q.add(list.get(k - 1));
				list.clear();
			}
			int[] answer = q.stream().mapToInt(i -> i).toArray();
			return answer;
		}
	}

	static class BestSol {
		public int[] solution(int[] array, int[][] commands) {
			int[] answer = new int[commands.length];

			for (int i = 0; i < commands.length; i++) {
				int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
				Arrays.sort(temp);
				answer[i] = temp[commands[i][2] - 1];
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		Solution sol = new Solution();
		for (int i : sol.solution(array, commands))	System.out.println(i);

	}

}
