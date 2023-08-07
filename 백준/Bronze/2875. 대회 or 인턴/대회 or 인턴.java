import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준대학교에서는 대회에 나갈 때 2명의 여학생과 1명의 남학생이 팀을 결성해서 나가는 것이 원칙
//여자가 2명이상이고, 남자가 2명 이상 있을 때, 남은 학생들의 합이 k보다 크거나 같을 때 팀을 만들 수 있다.

public class Main {
    static int N, M, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());  //여학생
        M = Integer.parseInt(st.nextToken());  //남학생
        K = Integer.parseInt(st.nextToken());  //인턴쉽

        int count = 0;

        while (N >= 2 && M >= 1 && M + N - 3 >= K) { //인턴쉽에 참여하지 않는다면 팀을 만들 수 있는 조건
            N -= 2;
            M -= 1;
            count++;
        }
//213   팀을 만들기에 충분한 학생이 부족한 경우
        //10 5 7 => 2!!!
        //8 4
        //6 3
        // 반례 처리: 남은 학생으로 팀을 만들 수 없는 경우 인턴쉽 참여자를 한 명씩 줄여가며 팀을 구성
//        while (N + M < K + 3) { // N + M -3 < k
//            K--;
//        }

        System.out.println(count);  // 남은 학생으로 팀을 만들 수 없는 경우에 대한 조건을 다루고 있습니다. 이 경우에는 인턴쉽 참여자를 줄여가며 팀을 구성하도록 조정하게 됩니다.
    }
}
