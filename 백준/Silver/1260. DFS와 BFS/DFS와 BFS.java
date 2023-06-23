import java.io.*;
import java.util.*;

public class Main {

    static int node, line, start;
    static boolean[] check;
    static int[][] arr;

    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());


        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];


        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1; // 정점 a와 b를 양방향으로 연결하여 그래프에 간선을 추가하는 것을 의미
        }

        dfs(start);
        sb.append("\n");

        Arrays.fill(check, false); // DFS 이후 check 배열 초기화

        bfs(start);
        System.out.println(sb);


    }

    public static void dfs(int start) {
        check[start] = true;
        sb.append(start).append(" ");

        for (int i = 1; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) { // !check[i]는 정점 i가 아직 방문되지 않았음을 나타내는 조건입니다. check[i] 값이 false이면 정점 i가 방문되지 않은 상태
                dfs(i);
            }
        }
    }
    public static void bfs(int start) {
        queue.offer(start);
        check[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            sb.append(x + " ");

            for(int i=1; i <= node; i++) {
                if (arr[x][i] == 1 && !check[i]) {
                    queue.offer(i);
                    check[i] = true;
                }
            }
        }
    }
}