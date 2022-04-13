package programmers.coding;
import java.util.*;
public class Lev1Budget {

	static class Solution {
	    public int solution(int[] d, int budget) {
	        Arrays.sort(d);
	        int max = 0;
	        int i;
	        for(i=0; i<d.length; i++){
	            max += d[i];
	            if(max >budget){
	                break;
	            }
	        }
	        return i;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
