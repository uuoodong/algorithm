package programmers.dfs_bfs;

public class Lev3Words {

	class Solution {
	    int answer;
	    boolean[] f;
	    void sol(String b, String t, String[] w, int cnt){
	        if(b.equals(t)){
	            answer=cnt;
	            return;
	        }
	        for(int i=0; i<f.length; i++){
	            if(f[i]){
	                continue;
	            }
	            int c=0;
	            for(int j=0; j<t.length(); j++){
	                if(b.charAt(j)==w[i].charAt(j)){
	                    c++;
	                }
	            }
	            if(c == b.length()-1){
	                f[i] = true;
	                sol(w[i], t, w, cnt+1);
	                f[i] = false;
	            }
	        }
	        
	    }
	    public int solution(String begin, String target, String[] words) {
	        answer = 0;
	        f = new boolean[words.length];
	        sol(begin, target, words, 0);
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
