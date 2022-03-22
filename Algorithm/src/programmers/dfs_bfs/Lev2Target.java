package programmers.dfs_bfs;

public class Lev2Target {

	static class Solution {
		int cnt = 0;

		void s(int result, int index, int[] num, int tar) {

			if (index == num.length - 1) {
				if (tar == result) {
					cnt++;
				}
				return;
			} else {
				s(result + num[index + 1], index + 1, num, tar);
				s(result - num[index + 1], index + 1, num, tar);
			}
		}

		public int solution(int[] numbers, int target) {
			int answer = 0;
			s(numbers[0], 0, numbers, target);
			s(-1 * numbers[0], 0, numbers, target);
			return cnt;
		}
	}

	public static void main(String[] args) {
		int[] num = {1,1,1,1,1};
		int target = 3;
		Solution sol = new Solution();
		System.out.println(sol.solution(num, target));

	}

}
