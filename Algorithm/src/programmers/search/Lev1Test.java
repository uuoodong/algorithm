package programmers.search;
import java.util.*;
public class Lev1Test {

	public static class Solution {
	    public static int[] solution(int[] answers) {
	        List<Integer> list = new ArrayList<>();
	        int[][] su = {{1, 2, 3, 4, 5}
	                      ,{2, 1, 2, 3, 2, 4, 2, 5} 
	                      ,{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
	        int[] cnt = {0, 0, 0};
	        for(int i = 0; i<answers.length; i++){
	            if(answers[i] == su[0][i%su[0].length]) cnt[0] +=1;
	            if(answers[i] == su[1][i%su[1].length]) cnt[1] +=1;
	            if(answers[i] == su[2][i%su[2].length]) cnt[2] +=1;
	        }
	        int max = Arrays.stream(cnt).max().getAsInt();
	        for(int i = 0; i<cnt.length; i++){
	            if(max == cnt[i]) list.add(i+1);
	        }
	        int[] answer = list.stream().mapToInt(i->i).toArray();
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		for(int i : Solution.solution(answers)) System.out.println(i);
	}

}
