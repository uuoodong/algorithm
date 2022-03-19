package programmers.hash;

import java.util.*;

class Lev1Participant {

	static class Solution {
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			Arrays.sort(participant);
			Arrays.sort(completion);
			String temp1 = "";
			String temp2 = "";
			for (int i = 0; i < completion.length; i++) {
				temp1 = participant[i];
				temp2 = completion[i];
				if (!temp1.equals(temp2)) {
					answer = participant[i];
					break;
				} else if (i == completion.length - 1 && temp1.equals(temp2)) {
					answer = participant[i + 1];
				}
			}

			return answer;
		}
	}

	static class BestSol {
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			HashMap<String, Integer> hm = new HashMap<>();
			for (String player : participant)
				hm.put(player, hm.getOrDefault(player, 0) + 1);
			for (String player : completion)
				hm.put(player, hm.get(player) - 1);

			for (String key : hm.keySet()) {
				if (hm.get(key) != 0) {
					answer = key;
				}
			}
			return answer;
		}
	}

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		Solution sol = new Solution();

		String answer = sol.solution(participant, completion);
		System.out.println(answer);
	}
}
