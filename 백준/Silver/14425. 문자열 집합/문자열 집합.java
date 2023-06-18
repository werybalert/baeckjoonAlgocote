import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        Set<String> sets = new HashSet<>();
        for (int i=0; i<N; i++) {
            sets.add(br.readLine());
        }

        int count = 0;
        for (int i=0; i<M; i++){
            if (sets.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);



    }


}
