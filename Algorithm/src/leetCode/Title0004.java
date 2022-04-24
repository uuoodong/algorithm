package leetCode;
import java.util.*;
public class Title0004 {
	
	class Solution {
	    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        List<Integer> list = new ArrayList<>();
	        for(int i: nums1) list.add(i);
	        for(int i: nums2) list.add(i);
	        Collections.sort(list);
	        int len = nums1.length + nums2.length;
	        if(len%2 == 1){
	            return 1.0*list.get(len/2);
	        }else{
	            int a= list.get(len/2);
	            int b= list.get(len/2 -1);
	            return ((a+b)*1.0)/2;
	        }
	        
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
