package programmers.greedy;
import java.util.*;
public class Lev2Boat {

	public static class Solution {
	    public static int solution(int[] people, int limit) {
	        int answer = 0;
	        Arrays.sort(people);
	        int min = 0;
	        for(int max =people.length-1; min<=max; max--){
	            if(people[min]+people[max]<=limit){
	                min++;
	            }
	            answer++;
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(Solution.solution(people, limit));
	}

}
