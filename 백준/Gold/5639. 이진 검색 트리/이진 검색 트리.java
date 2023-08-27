
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

//  노드의 왼쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 작다.
//  노드의 오른쪽 서브트리에 있는 모든 노드의 키는 노드의 키보다 크다.
//  왼쪽, 오른쪽 서브트리도 이진 검색 트리이다.


  static ArrayList<Integer> tree;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //StringTokenizer st;
    tree = new ArrayList<Integer>();
    while (true) {
      String n = br.readLine();
      if (n == null || n.equals("")) break;
      // 더이상의 인풋이 존재하지 않으면 break

      tree.add(Integer.parseInt(n));
    }

    postOrder(0, tree.size() - 1);
  }

  public static void postOrder(int idx, int end) {
    if (idx > end) return;
    // 리스트 범위를 벗어나면 return

    int mid = idx + 1;
    while (mid <= end && tree.get(mid) < tree.get(idx)) {
      mid++;
    }
    postOrder(idx + 1, mid - 1);
    postOrder(mid, end);
    System.out.println(tree.get(idx));
  }
}


