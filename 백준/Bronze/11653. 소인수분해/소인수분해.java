import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i =2; i < N; i++) {
            while(true) {
                if (N %i == 0) {
                    N = N /i;
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
        if (N >1) {
            System.out.println(N);
        }
    }
}

