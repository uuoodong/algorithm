package programmers.dp;

public class Lev3School {

	// dp success
	public class BestSol {
	    public int solution(int m, int n, int[][] puddles) {
	        int[][] dp = new int[m+1][n+1];
	        for(int i=0;i<puddles.length;i++){
	            dp[puddles[i][0]][puddles[i][1]]=-1;
	        }
	        dp[1][1]=1; 
	        for(int i=1;i<=m;i++){
	            for(int j=1;j<=n;j++){
	                if(dp[i][j]==-1){
	                    dp[i][j]=0;
	                    continue;
	                }
	                if(i!=1)    dp[i][j]+=dp[i-1][j]%1000000007;
	                if(j!=1)    dp[i][j]+=dp[i][j-1]%1000000007;
	            }
	        }
	        return dp[m][n]%1000000007;
	    }
	}

	// dfs fail
	public class Solution {
		int answer;

		void sol(int[][] mt, int[] s) {
			int x = s[1];
			int y = s[0];

			if (y == mt.length - 1 && x == mt[0].length - 1) {
				answer++;
				return;
			} else {
				int nX = s[1] + 1;
				int nY = s[0] + 1;
				if (y < mt.length - 1 && mt[nY][x] != 1) {
					s[0] = nY;
					sol(mt, s);
					s[0] -= 1;
				}
				if (x < mt[0].length - 1 && mt[y][nX] != 1) {
					s[1] = nX;
					sol(mt, s);
				}
			}
		}

		public int solution(int m, int n, int[][] puddles) {
			int[][] mt = new int[n][m];
			for (int[] i : puddles)
				mt[i[1] - 1][i[0] - 1] = 1;
			answer = 0;
			int[] start = new int[2];
			sol(mt, start);
			return answer % 1000000007;
		}
	}

	public static void main(String[] args) {

	}

}
