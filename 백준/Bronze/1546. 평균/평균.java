import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); 
        String[] scores = br.readLine().split(" "); 

        double sum = 0;
        double max = Integer.parseInt(scores[0]);

        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(scores[i]);
            sum += score;

            if (score > max) {
                max = score;
            }
        }

        double average = (sum / max) * 100 / N;
        System.out.println(average);

        }

    }
