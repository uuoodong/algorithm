package programmers.coding;

public class Lev1Create_prime_numbers {

	class Solution {
		int answer;

		void prime(int x) {
			if (x == 0)
				return;
			if (x == 1)
				return;
			for (int i = 2; i <= (int) Math.sqrt(x); i++) {
				if (x % i == 0)
					return;
			}
			answer++;
		}

		public int solution(int[] nums) {
			answer = 0;
			for (int i = 0; i < nums.length - 2; i++) {
				for (int j = i + 1; j < nums.length - 1; j++) {
					for (int k = j + 1; k < nums.length; k++) {
						prime(nums[i] + nums[j] + nums[k]);
					}
				}
			}

			return answer;
		}
	}

	public static void main(String[] args) {
		

	}

}
