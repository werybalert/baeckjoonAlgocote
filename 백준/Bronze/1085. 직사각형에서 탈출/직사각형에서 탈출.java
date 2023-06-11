import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X1 = Integer.parseInt(st.nextToken());
        int Y1 = Integer.parseInt(st.nextToken());
        int X2 = Integer.parseInt(st.nextToken());
        int Y2 = Integer.parseInt(st.nextToken());

        int minDistance = X1;

        if (minDistance >  Y1) {
            minDistance = Y1;
        }
        if (minDistance > X2 -X1 ) {
            minDistance = X2 -X1;
        }
        if (minDistance> Y2 - Y1) {
            minDistance = Y2 - Y1;
        }
        System.out.println(minDistance);
    }
}