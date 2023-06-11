import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        while ( true ){
            st = new StringTokenizer(br.readLine()," ");
            
            int first = Integer.parseInt(st.nextToken());
            int secound = Integer.parseInt(st.nextToken());

            if (first ==0 && secound == 0)
                break;
            if (secound% first == 0) {
                System.out.println("factor");
            } else if ( first % secound == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}