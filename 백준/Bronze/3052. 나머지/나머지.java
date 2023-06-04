import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] visited = new boolean[42]; 
        int count = 0; 

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42; 

            if (!visited[remainder]) {
                visited[remainder] = true;
                count++;
            }
        }

        System.out.println(count);

        }
}