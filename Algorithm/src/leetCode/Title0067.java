package leetCode;

public class Title0067 {

	class Solution {
		public String addBinary(String a, String b) {
			StringBuilder ans = new StringBuilder();
			int i = a.length() - 1;
			int j = b.length() - 1;
			int sum = 0;
			while (sum > 0 || i >= 0 || j >= 0) {
				if (i >= 0) {
					sum += a.charAt(i) - '0';
					i--;
				}
				if (j >= 0) {
					sum += b.charAt(j) - '0';
					j--;
				}
				ans.append(sum % 2);
				sum /= 2;
			}
			return ans.reverse().toString();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
