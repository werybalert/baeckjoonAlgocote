import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //첫 줄
        Integer[] A = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // A는 정렬하면

        //두번쨰줄
        Integer[] B = new Integer[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B, Comparator.reverseOrder()); // 반대로 역순을 줘야한다.

        int result = 0;
        for (int i=0; i<N; i++) {
            result += A[i] * B[i];
        }
        System.out.print(result);
    }
}
