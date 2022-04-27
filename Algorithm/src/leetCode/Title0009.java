package leetCode;

public class Title0009 {

	class Solution {
	    public boolean isPalindrome(int x) {
	        if(x<0) return false;
	        if(x ==0) return true;
	        String t = Integer.toString(x);
	        String r = "";
	        for(int i= t.length()-1; i>=0; i--){
	            r += t.charAt(i);
	        }
	        if(t.equals(r)) return true;
	        return false;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
