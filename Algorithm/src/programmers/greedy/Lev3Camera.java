package programmers.greedy;
import java.util.*;
public class Lev3Camera {

	class Solution {
	    public int solution(int[][] routes) {
			Arrays.sort(routes, (a,b)-> a[1]-b[1]);
			int cnt = 0;	
			int min = Integer.MIN_VALUE;
			for(int[] route : routes) {
				if(min <  route[0] ) {
					min = route[1];
					cnt++;
				}
			}
	        return cnt;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
