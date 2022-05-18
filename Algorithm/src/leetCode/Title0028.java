package leetCode;

public class Title0028 {

	class Solution {
		public int strStr(String haystack, String needle) {
			int a = needle.length();
			for (int i = 0; i <= haystack.length() - a; i++) {
				String t = haystack.substring(i, i + a);
				if (t.equals(needle)) {
					return i;
				}
			}
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
