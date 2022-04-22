package programmers.coding;

public class Lev3Sticker {

	class Solution {
	    public int solution(int sticker[]) {
	        int answer = 0;
	        int len = sticker.length;
	        if(len == 1) return sticker[0];
	        int[] t1 = new int[len];
	        int[] t2 = new int[len];
	        t1[0] = sticker[0];
	        t1[1] = sticker[0];
	        
	        t2[1] = sticker[1];
	        for(int i=2; i<len; i++){
	            t1[i] = Math.max(t1[i-2]+sticker[i], t1[i-1]);
	            t2[i] = Math.max(t2[i-2]+sticker[i], t2[i-1]);
	        }
	        answer = Math.max(t1[len-2], t2[len-1]);

	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
