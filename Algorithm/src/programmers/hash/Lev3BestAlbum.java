package programmers.hash;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lev3BestAlbum {

	static class Solution {
		public int[] solution(String[] genres, int[] plays) {

			List<Integer> list = new ArrayList<>();

			Map<String, Integer> g = new HashMap<>();
			for (int i = 0; i < genres.length; i++) {
				g.put(genres[i], g.getOrDefault(genres[i], 0) + plays[i]);
			}
			List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(g.entrySet());

			Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {
				public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
					return obj2.getValue().compareTo(obj1.getValue());
				}
			});
			Map<Integer, Integer> p = new HashMap<>();
			for (Entry<String, Integer> entry : entryList) {

				String gen = entry.getKey();
				for (int i = 0; i < plays.length; i++) {
					if (gen.equals(genres[i])) {
						p.put(i, plays[i]);
					}
				}
				Set<Entry<Integer, Integer>> entrySet = p.entrySet();
				if (p.size() > 1) {
					for (int j = 0; j < 2; j++) {
						Integer maxValue = Collections.max(p.values());
						Integer key = 0;
						for (Entry<Integer, Integer> entry2 : entrySet) {
							if (entry2.getValue() == maxValue) {
								list.add(entry2.getKey());
								key = entry2.getKey();
								break;
							}
						}
						p.remove(key);
					}
				} else {
					for (Entry<Integer, Integer> entry2 : entrySet) {
						list.add(entry2.getKey());
					}
				}
				p.clear();
			}
			int[] answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i).intValue();
			}

			return answer;
		}
	}

	static class BestSol {
		  public class Music implements Comparable<Music>{

		    private int played;
		    private int id;
		    private String genre;

		    public Music(String genre, int played, int id) {
		      this.genre = genre; 
		      this.played = played;
		      this.id = id;
		    }

		    @Override
		    public int compareTo(Music other) {
		      if(this.played == other.played) return this.id - other.id;
		      return other.played - this.played;
		    }

		    public String getGenre() {return genre;}
		  }

		  public int[] solution(String[] genres, int[] plays) {
		    return IntStream.range(0, genres.length)
		    .mapToObj(i -> new Music(genres[i], plays[i], i))
		    .collect(Collectors.groupingBy(Music::getGenre))
		    .entrySet().stream()
		    .sorted((a, b) -> sum(b.getValue()) - sum(a.getValue()))
		    .flatMap(x->x.getValue().stream().sorted().limit(2))
		    .mapToInt(x->x.id).toArray();
		  }

		  private int sum(List<Music> value) {
		    int answer = 0;
		    for (Music music : value) {
		      answer+=music.played;
		    }
		    return answer;
		  }
		}
	
	public static void main(String[] args) {
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		Solution sol = new Solution();
		for(int i : sol.solution(genres, plays)) System.out.println(i);
		
	}

}
