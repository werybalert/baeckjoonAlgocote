import java.io.*;
import java.util.*;

public class Main {
//    킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sf = new StringBuffer();

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] found = new int[6];
        int[] cf = new int[6];

        String[] st = br.readLine().split(" ");

        for (int i=0; i<chess.length; i++) {
 
            found[i]=Integer.parseInt(st[i]);
            cf[i] = chess[i] - found[i];
        }
        for(int i=0; i< cf.length;i++ ) {
            System.out.printf("%d ", cf[i]);
        }
    }
}     