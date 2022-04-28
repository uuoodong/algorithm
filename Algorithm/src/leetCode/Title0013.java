package leetCode;

public class Title0013 {
	class Solution {
		public int romanToInt(String s) {
			int ans = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				char x = s.charAt(i);
				if (x == 'I') {
					ans += (ans >= 10 || ans >= 5) ? -1 : 1;
				} else if (x == 'V') {
					ans += 5;
				} else if (x == 'X') {
					ans += (ans >= 100 || ans >= 50) ? -10 : 10;
				} else if (x == 'L') {
					ans += 50;
				} else if (x == 'C') {
					ans += (ans >= 1000 || ans >= 500) ? -100 : 100;
				} else if (x == 'D') {
					ans += 500;
				} else if (x == 'M') {
					ans += 1000;
				}
				System.out.println(ans);
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
