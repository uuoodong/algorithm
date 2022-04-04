package programmers.greedy;
import java.util.Stack;
public class Lev2Big_number {

	static class Solution {
	    public String solution(String number, int k) {
	        String answer = "";
	        StringBuilder s = new StringBuilder();
	        int index = 0;
	        int max = 0;
	        
	        for(int i = 0; i<number.length()-k; i++){
	            max = 0;
	            for(int j = index; j<=k+i; j++){
	                if(max < number.charAt(j)-'0'){
	                    max = number.charAt(j)-'0';
	                    index = j+1;
	                }
	            }
	            s.append(max);
	        }
	        answer = s.toString();
	        
	        return answer;
	    }
	}
	
	static class BestSol {
	    public String solution(String number, int k) {
	        char[] result = new char[number.length() - k];
	        Stack<Character> stack = new Stack<>();

	        for (int i=0; i<number.length(); i++) {
	            char c = number.charAt(i);
	            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
	                stack.pop();
	            }
	            stack.push(c);
	        }
	        for (int i=0; i<result.length; i++) {
	            result[i] = stack.get(i);
	        }
	        return new String(result);
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
