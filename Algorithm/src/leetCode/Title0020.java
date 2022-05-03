package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Title0020 {

	static class Solution {
		public boolean isValid(String s) {
			boolean ans = false;
			Map<Character, Character> map = new HashMap<>();
			map.put(')', '(');
			map.put(']', '[');
			map.put('}', '{');

			Stack<Character> stk = new Stack<Character>();
			Set<Character> seto = new HashSet<>();
			seto.addAll(Set.of('(', '[', '{'));
			Set<Character> setc = new HashSet<>();
			setc.addAll(Set.of(')', ']', '}'));

			for (char c : s.toCharArray()) {
				if (seto.contains(c)) {
					stk.push(c);
				} else if (setc.contains(c)) {
					char cc = map.get(c);
					if (stk.isEmpty()) {
						ans = false;
					} else {
						ans = cc == stk.pop() ? true : false;
					}
					if (!ans)
						break;
				}

			}
			ans = stk.isEmpty() ? ans : false;
			return ans;
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean a = sol.isValid("{}()[]");
		System.out.println(a);
	}

}
