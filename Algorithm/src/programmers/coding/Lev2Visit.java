package programmers.coding;
import java.util.*;
public class Lev2Visit {

	class Solution {
	    public int solution(String dirs) {
	        int answer = 0;
	        int x=0;
	        int y=0;
	        List<String> v = new ArrayList<>();
	        
	        for(int i=0; i<dirs.length(); i++){
	            int reX = x; 
	            int reY = y;
	            char s = dirs.charAt(i);
	            
	            if(s =='U' && y<5) y++;
	            else if(s == 'D' && y>-5) y--;
	            else if(s == 'R' && x<5) x++;
	            else if(s == 'L' && x>-5) x--;
	            
	            String xy = Integer.toString(x);
	            xy += Integer.toString(y);
	            String reXY = Integer.toString(reX);
	            reXY += Integer.toString(reY);
	            String st = xy + reXY;
	            String nd = reXY + xy;
	            if(!v.contains(st) && !v.contains(nd) && !st.equals(nd)){
	                v.add(st);
	                v.add(nd);
	            }

	        }
	        answer = v.size() / 2;
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
