package programmers.dfs_bfs;
import java.util.*;
public class Lev3Network {

	public static class Solution {
	    boolean[] v;
	    void bfs(int a, int[][] computers){
	        Queue<Integer> q = new LinkedList<>();
	        q.offer(a);
	        v[a] = true;
	        while(!q.isEmpty()){
	            int x = q.poll();
	            
	            for(int i=0; i<computers.length; i++){
	                if(!v[i] && computers[x][i] == 1 && x != i){
	                    v[i] = true;
	                    q.offer(i);
	                }
	            }
	            
	        }
	    }
	    public int solution(int n, int[][] computers) {
	        int answer = 0;
	        v = new boolean[n];
	        for(int i=0; i<n; i++){
	            if(!v[i]){
	                bfs(i, computers);
	                answer++;
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
