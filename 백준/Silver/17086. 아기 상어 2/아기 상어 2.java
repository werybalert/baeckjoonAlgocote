import java.io.*;
import java.util.*;

public class Main {

    static class Shark {
        int x, y;

        public Shark(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] check;
    static int[][] map;
    static int M, N;

    static Queue<Shark> q = new LinkedList<>();

    static int[] dX = { 0, 1, 1, 1, 0, -1, -1, -1 };
    static int[] dY = { 1, 1, 0, -1, -1, -1, 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        check = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    q.add(new Shark(j, i));
                }
            }
        }

        int answer = Integer.MIN_VALUE;

        Shark cur;
        while (!q.isEmpty()) {
            cur = q.poll();
            int x = cur.x;
            int y = cur.y;
            for (int j = 0; j < 8; j++) {
                int y2 = y + dX[j];
                int X2 = x + dY[j];
                if (X2 < 0 || y2 < 0 || X2 >= M || y2 >= N)
                    continue;
                if (check[y2][X2] != 0 || map[y2][X2] == 1)
                    continue;
                check[y2][X2] = check[y][x] + 1;
                if (check[y2][X2] > answer)
                    answer = check[y2][X2];
                q.add(new Shark(X2, y2));
            }
        }
        System.out.print(answer);

    }
}
