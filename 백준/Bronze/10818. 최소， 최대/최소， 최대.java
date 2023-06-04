import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print(min + " " + max);
        }
    }