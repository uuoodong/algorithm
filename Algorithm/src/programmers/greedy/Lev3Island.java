package programmers.greedy;
import java.util.*;
public class Lev3Island {

	class Solution {
	    int[] parent;
	    int findParent(int node){
	        if(parent[node] == node) return node;
	        return parent[node] = findParent(parent[node]);
	    }
	    public int solution(int n, int[][] costs) {
	        Arrays.sort(costs, (o1,o2)-> o1[2]-o2[2]);
	        parent = new int[n];
	        for(int i=0; i<n; i++) parent[i]=i;
	        int total = 0;
	        for(int[] a: costs) System.out.println(a[0] + " " + a[1] + " "+a[2] + " ");
	        for(int[] edge: costs){
	            for(int a : parent) System.out.print(a+" ");
	            System.out.println();
	            int from = edge[0];
	            int to = edge[1];
	            int cost = edge[2];
	            int fromParent = findParent(from);
	            int toParent = findParent(to);
	            if(fromParent == toParent){
	                continue;
	            }
	            total += cost;
	            parent[toParent] = fromParent;
	        }
	        
	        return total;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
