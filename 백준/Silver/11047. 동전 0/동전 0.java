import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> Min = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        int count  = 0;

        for (int i=0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for (int i=N-1; i >=0; i--) {
            if (coin[i] <= K) { // 현재 동전의 가치가 k 보다 작거나 같아야지 구성 가능~!
                count += K / coin[i];
                K = K % coin[i];
            }
        }
        System.out.println(count);
        }
    }

