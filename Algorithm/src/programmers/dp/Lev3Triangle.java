package programmers.dp;

public class Lev3Triangle {

	class Solution {
	    public int solution(int[][] triangle) {
	        int answer = 0;
	        int n = triangle.length;
	        int[][] t = new int[n][n];
	        t[0][0] = triangle[0][0];
	        
	        for(int i=1; i<n; i++){
	            int r = triangle[i].length;
	            for(int j=0; j<triangle[i].length;j++){
	                if(j==0) {
	                    t[i][j] = t[i-1][j] +triangle[i][j];
	                    continue;
	                }
	                if(j==r-1) {
	                    t[i][j] = t[i-1][j-1] +triangle[i][j];
	                    continue;
	                }
	                int max = Math.max(t[i-1][j-1],t[i-1][j]);
	                t[i][j] = max +triangle[i][j];
	            }
	        }
	        for(int i=0; i<n;i++){
	            answer = Math.max(t[n-1][i], answer);
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
