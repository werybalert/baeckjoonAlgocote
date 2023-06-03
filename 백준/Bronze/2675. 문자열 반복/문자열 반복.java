import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sf = new StringBuffer();
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i =0; i<T; i++) {
            String[] st = br.readLine().split(" ");
            
            int R = Integer.parseInt(st[0]);
            
            for (int j=0; j<st[1].length(); j++) {
                for (int k=0;k < R; k++) {
                    sf.append(st[1].charAt(j));
                }
            }sf.append("\n");
        }System.out.println(sf.toString());
    }
}