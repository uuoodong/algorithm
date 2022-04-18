package programmers.coding;
import java.util.*;
public class Lev2Skill {
	
	class Solution {
	    public int solution(String skill, String[] skill_trees) {
	        int answer = skill_trees.length;
	        int cnt =0;
	        List<Character> list = new ArrayList<>();
	        for(int i=0; i< skill.length(); i++) list.add(skill.charAt(i));
	        for(String i: skill_trees){
	            for(int j=0; j<i.length(); j++){
	                char t = i.charAt(j);
	                if(list.contains(t)){
	                    int index = list.indexOf(Character.valueOf(t));
	                    if(cnt != index){
	                        answer--;
	                        break;
	                    }else{
	                        cnt++;
	                    }
	                }
	            }
	            cnt = 0;
	        }
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
