import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                list.add((char)(remainder + '0'));
           } else {list.add((char)(remainder -10 +'A'));
        }
            N /= B;
        }
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i));
        }

    }
}