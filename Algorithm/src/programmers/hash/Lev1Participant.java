package programmers.hash;

class Lev1Participant {
	
	static class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        return answer;
	    }
	}
	
	public static void main(String[] args) { 
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Solution sol = new Solution();
		
		String answer = sol.solution(participant, completion);
		System.out.println(answer);
	}
}
