package leetCode;

import java.util.*;

public class Title0014 {

	class Solution {
		public String longestCommonPrefix(String[] strs) {
			Arrays.sort(strs);
			int cnt = 0;
			boolean f = false;
			for (int i = 0; i < strs[0].length(); i++) {
				char t = strs[0].charAt(i);
				for (int j = 1; j < strs.length; j++) {
					if (t != strs[j].charAt(i)) {
						f = true;
					}
					if (f)
						break;
				}
				if (f)
					break;
				cnt++;
			}
			return strs[0].substring(0, cnt);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
