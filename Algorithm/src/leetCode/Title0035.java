package leetCode;

public class Title0035 {

	class Solution {
		public int searchInsert(int[] nums, int target) {
			int idx = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < target) {
					idx++;
				} else {
					return idx;
				}
			}
			return idx;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
