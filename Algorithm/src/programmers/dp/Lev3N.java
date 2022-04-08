package programmers.dp;

public class Lev3N {

	class Solution {
	    int answer = Integer.MAX_VALUE;
	    void sol(int n, int num, int c, int p){
	        if(c>8){
	            answer=-1;
	            return;
	        }
	        if(p==num){
	            answer = Math.min(answer,c);
	            return;
	        }
	        int temp = n;
	        for(int i=0; i<8-c; i++){
	            int cnt = c+i+1;
	            sol(n, num, cnt, p+temp);
	            sol(n, num, cnt, p-temp);
	            sol(n, num, cnt, p*temp);
	            sol(n, num, cnt, p/temp);
	            temp = (temp*10)+n;
	        }
	    }
	    public int solution(int N, int number) {
	        sol(N,number,0, 0);
	        
	        return answer==Integer.MAX_VALUE ? -1 : answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
