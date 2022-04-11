package programmers.dp;

public class Lev4Stealing {

	static class Solution {
	    public int solution(int[] money) {
	        int answer = 0;
	        int l = money.length;
	        int[] f = new int[l];
	        int[] s = new int[l];
	        f[0] = money[0];
	        f[1] = money[0];
	        s[0] = 0;
	        s[1] = money[1];
	        
	        for(int i=2; i<l; i++){
	            f[i] = Math.max(f[i-2]+money[i], f[i-1]);
	            s[i] = Math.max(s[i-2]+money[i], s[i-1]);
	        }
	        answer = Math.max(f[l-2], s[l-1]);
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
