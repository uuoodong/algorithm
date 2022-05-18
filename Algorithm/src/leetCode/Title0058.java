package leetCode;

public class Title0058 {

	class Solution {
		public int lengthOfLastWord(String s) {
			if (s.length() == 0)
				return 0;
			int cnt = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				char a = s.charAt(i);
				if (a == ' ') {
					if (cnt > 0) {
						return cnt;
					} else {
						continue;
					}
				} else {
					cnt++;
				}
			}
			return cnt;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
