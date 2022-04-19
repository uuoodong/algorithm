package programmers.coding;
import java.util.*;
public class Lev3Number {

	class Solution {
	    public int solution(int[] A, int[] B) {
	        int answer = 0;
	        List<Integer> listA = new ArrayList<>();
	        List<Integer> listB = new ArrayList<>();
	        for(int i: A) listA.add(i);
	        for(int i: B) listB.add(i);
	        Collections.sort(listA, Collections.reverseOrder());
	        Collections.sort(listB, Collections.reverseOrder());

	        int cnt=0;
	        for(int i=0; i<listA.size(); i++){
	            int a=listA.get(i);
	            int b=listB.get(cnt);
	            if(b>a){
	                answer++;
	                cnt++;
	            }

	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
