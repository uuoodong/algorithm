package leetCode;

public class Title0053 {

	class Solution {
	    public int maxSubArray(int[] nums) {
	        int sum = nums[0], ans = nums[0];
	        for(int i=1; i<nums.length; i++){
	            sum = Math.max(nums[i]+sum, nums[i]);
	            ans = Math.max(sum,ans);
	        }
	        return ans;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
