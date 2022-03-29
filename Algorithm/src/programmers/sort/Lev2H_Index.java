package programmers.sort;
import java.util.*;
public class Lev2H_Index {

	static class Solution {
	    public int solution(int[] citations) {
	        int answer = 0;
	        List<Integer> list = new ArrayList<>();
	        for(int i : citations) list.add(i);
	        Collections.sort(list, Collections.reverseOrder());
	        for(int i = list.size(); i>0; i--){
	            if(list.get(i-1) >= i){
	                return i;
	            }
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		

	}

}
