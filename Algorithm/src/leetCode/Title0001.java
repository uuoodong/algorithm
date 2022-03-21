package leetCode;

class Title0001 {

	private static class Solution {
		int[] twoSum(int[] nums, int target) {
			int temp = 0;
			int[] answer = { 0, 0 };
			for (int i = 0; i < nums.length; i++) {
				temp = target - nums[i];
				for (int j = 0; j < nums.length; j++) {
					if (i != j && temp == nums[j]) {
						answer[0] = i;
						answer[1] = j;
						break;
					}
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int tartget = 9;
		Solution sol = new Solution();
		for(int i : sol.twoSum(nums, tartget)) System.out.println(i);
	}

}
