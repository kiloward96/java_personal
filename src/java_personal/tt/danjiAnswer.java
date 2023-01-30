package java_personal.tt;

import java.util.Arrays;
import java.util.Scanner;

public class danjiAnswer {
	    private static int dx[] = {0,0,1,-1};
	    private static int dy[] = {1,-1,0,0};
	    private static int[] aparts = new int[25*25];
	    private static int n;
	    private static int apartNum = 0; //아파트 단지 번호의 수
	    private static boolean[][] visited = new boolean[25][25]; //방문여부
	    private static int[][] map = new int[25][25]; //지도

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();

	        map = new int[n][n];
	        visited = new boolean[n][n];

	        //전체 사각형 입력 받기
	        for(int i=0; i<n; i++){
	            String input = sc.next();
	            for(int j=0; j<n; j++){
	                map[i][j] = input.charAt(j)-'0';
	            }
	        }

	        for(int i=0; i<n; i++){
	            for(int j=0; j<n; j++){
	                if(map[i][j] == 1 && !visited[i][j]){
	                    apartNum++;
	                    dfs(i,j);
	                }
	            }
	        }

	        Arrays.sort(aparts);
	        System.out.println(apartNum);

	        for(int i=0; i<aparts.length; i++){
	            if(aparts[i] == 0){
	            }else{               
	                System.out.println(aparts[i]);
	            }
	        }
	    }

	    private static void dfs(int x, int y) {
	        visited[x][y] = true;
	        aparts[apartNum]++;

	        for(int i=0; i<4; i++){
	            int nx = x + dx[i];
	            int ny = y + dy[i];

	            if(nx >=0 && ny >=0 && nx < n && ny < n){
	                if(map[nx][ny] == 1 && !visited[nx][ny]){
	                    dfs(nx,ny);
	                }
	            }
	        }
	    }
	}














	/*
	 * import java.io.BufferedReader; import java.io.IOException; import
	 * java.io.InputStreamReader; import java.util.ArrayList; import
	 * java.util.Collections; import java.util.List; import
	 * java.util.StringTokenizer;
	 * 
	 * public class Main {
	 * 
	 * static int n;// 지도 크기 static int[][] maps; static boolean[][] visited;
	 * 
	 * static int total=0; // 총 단지수 static int cnt; static List<Integer> cnts = new
	 * ArrayList<>();// 각 단지에 속하는 집의 수
	 * 
	 * // 북 동 남 서 static int[] dy = {-1, 0, 1, 0}; // 세로 static int[] dx = {0, 1, 0,
	 * -1}; // 가로
	 * 
	 * public static void main(String[] args) throws IOException { BufferedReader br
	 * = new BufferedReader(new InputStreamReader(System.in));
	 * 
	 * String str = br.readLine(); n = Integer.parseInt(str);
	 * 
	 * maps = new int[n][n]; visited = new boolean[n][n];
	 * 
	 * for(int i=0; i<n; i++) { str = br.readLine(); for(int j=0; j<n; j++) {
	 * maps[i][j]=Integer.parseInt(str.split("")[j]); } } // === 입력 끝=======
	 * 
	 * // 탐색 + 단지 수 정해주기 for(int i=0; i<n; i++) { for(int j=0; j<n; j++) { cnt = 0;
	 * if(maps[i][j]==1 && !visited[i][j]) { total++; cnt++; dfs(i, j);
	 * cnts.add(cnt); } } }
	 * 
	 * // 출력 System.out.println(total); Collections.sort(cnts); for(int i=0;
	 * i<cnts.size(); i++) { System.out.println(cnts.get(i)); }
	 * 
	 * }
	 * 
	 * static void dfs(int cy, int cx) {
	 * 
	 * visited[cy][cx] = true;
	 * 
	 * int ny, nx; for(int i=0; i<4; i++) { ny = cy + dy[i]; nx = cx + dx[i];
	 * 
	 * if(ny>=0 && ny<n && nx>=0 && nx<n) { if(!visited[ny][nx] && maps[ny][nx]==1)
	 * { cnt++; dfs(ny, nx); } } }
	 * 
	 * }
	 * 
	 * }
	 */