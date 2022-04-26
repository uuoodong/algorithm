package leetCode;

public class Title0006 {

	class Solution {
		public String convert(String s, int numRows) {
			if (numRows == 1)
				return s;
			int cnt = numRows + numRows - 2;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < numRows; i++) {

				for (int j = 0; j + i < s.length(); j += cnt) {
					sb.append(s.charAt(j + i));
					if (i != 0 && i != numRows - 1 && j + cnt - i < s.length()) {
						sb.append(s.charAt(j + cnt - i));
					}
				}

			}

			return sb.toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
