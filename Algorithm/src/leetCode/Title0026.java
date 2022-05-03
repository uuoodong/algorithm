package leetCode;

public class Title0026 {
	class Solution {
		public int removeDuplicates(int[] nums) {
			int idx = 1;
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] != nums[i + 1]) {
					nums[idx++] = nums[i + 1];
				}
			}
			return idx;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
