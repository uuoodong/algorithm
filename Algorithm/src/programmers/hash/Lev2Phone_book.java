package programmers.hash;

import java.util.*;

class Lev2Phone_book {

	static class Solution {
	    public boolean solution(String[] phone_book) {      
	        Arrays.sort(phone_book);                
	        for(int i=0; i<phone_book.length; i++){
	            String temp = "";
	            for(int j=0; j<phone_book.length; j++){
	                if(phone_book[i].length() > phone_book[j].length()){
	                    continue;
	                }
	                temp = phone_book[j].substring(0,phone_book[i].length());
	                if(temp.equals(phone_book[i]) && i!=j){
	                    return false;                    
	                }
	            }
	        }
	        
	        return true;
	    }
	}
	
	static class BestSol {
	    public boolean solution(String[] phone_book) {	        
	        Map<String, Integer> map = new HashMap<>();
	        for(String i : phone_book) map.put(i,0);
	        
	        for(int i =0; i<phone_book.length; i++){            
	            for(int j=1; j<phone_book[i].length(); j++){                
	                if(map.containsKey(phone_book[i].substring(0,j))){
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	}
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};		
		Solution sol = new Solution();
		System.out.println(sol.solution(phone_book));
	}

}
