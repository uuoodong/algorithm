package programmers.heap;
import java.util.*;
public class Lev3Priority {

	public static class Solution {
	    public static int[] solution(String[] operations) {
	        List<Integer> list = new ArrayList<>();
	        for(int i = 0; i<operations.length; i++){
	            if(operations[i].charAt(0)=='I'){
	                int n = Integer.parseInt(operations[i].substring(2,operations[i].length()));
	                list.add(n);
	            }else if(operations[i].charAt(0)=='D' && !list.isEmpty()){
	                int index = Integer.parseInt(operations[i].substring(2,operations[i].length()));
	                if(index == -1){
	                    int min = Collections.min(list);
	                    list.remove(Integer.valueOf(min));
	                }else if(index == 1){
	                    int max = Collections.max(list);
	                    list.remove(Integer.valueOf(max));
	                }
	            }
	        }
	        if(list.isEmpty()){
	            return new int[] {0, 0};
	        }else{
	            int max = Collections.max(list);
	            int min = Collections.min(list);
	            return new int[] {max, min};
	        }
	    }
	}
	
	public static void main(String[] args) {
		String[] operations = {"I 7","I 5","I -5","D -1"};
		for(int i : Solution.solution(operations)) System.out.println(i);
	}

}
