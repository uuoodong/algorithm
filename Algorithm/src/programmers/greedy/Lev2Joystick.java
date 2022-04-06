package programmers.greedy;

public class Lev2Joystick {

	public static class Solution {
		public static int solution(String name) {
			int answer = 0;
			int l = name.length();
			int index;
			int move = l - 1;
			for (int i = 0; i < l; i++) {
				answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

				index = i + 1;
				while (index < l && name.charAt(index) == 'A') {
					index++;
				}
				int a = i * 2 + l - index;
				move = Math.min(move, i * 2 + l - index);
				move = Math.min(move, (l - index) * 2 + i);
			}
			return answer + move;
		}
	}

	public static void main(String[] args) {
		String[] name = {"JEROEN", "JAN", "JAZ", "ABAAAAAAAAABB", "BBBBAAAAAB", "BBAABB"};
		for(String a : name) {
			System.out.println(Solution.solution(a));
		}
	}

}