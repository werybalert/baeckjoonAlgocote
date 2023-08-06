import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
     static int[][] map;
        static boolean[][] visit;
        static int N;
        static int[] dy = {1, 0, -1, 0};
        static int[] dx = {0, 1, 0 , -1};
        static class Node {
            int y, x;
            public Node(int y, int x) {
                this.y = y;
                this.x = x;
            }
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            map = new int[N][N];
            visit = new boolean[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                for (int j = 0; j < N; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            for (int i = 0; i <= 100; i++) {
                visit = new boolean[N][N];
                max = Math.max(max, bfs(i));
            }

            System.out.println(max);
        }

        public static int bfs(int n) {
            int watarhelp = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(map[i][j] <= n || visit[i][j]) 
                        continue;

                    Queue<Node> q = new LinkedList<Node>();
                    visit[i][j] = true;
                    q.add(new Node(i, j));

                    while(!q.isEmpty()) {
                        Node cur = q.poll();

                        for (int dir = 0; dir < 4; dir++) {
                            int ny = cur.y + dy[dir];
                            int nx = cur.x + dx[dir];

                            if(ny < 0 || ny >= N || nx < 0 || nx >= N) 
                                continue;
                            if(map[ny][nx] <= n || visit[ny][nx]) 
                                continue;

                            visit[ny][nx] = true;
                            q.add(new Node(ny, nx));
                        }
                    }
                    watarhelp++;
                }
            }
            return watarhelp;
    }

}
