import java.util.*;

class SpiralTraverseMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] matrix = new int[r][c];
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    ArrayList<Integer> res = new ArrayList<>();
    res = spirallyTraverse(matrix, r, c);
    System.out.println(res);
    sc.close();
  }

  private static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
    ArrayList<Integer> res = new ArrayList<>();
    int i, k = 0, l = 0;

    while (k < r && l < c) {
      for (i = l; i < c; ++i) {
        res.add(matrix[k][i]);
      }
      k++;

      for (i = k; i < r; ++i) {
        res.add(matrix[i][c - 1]);
      }
      c--;

      if (k < r) {
        for (i = c - 1; i >= l; --i) {
          res.add(matrix[r - 1][i]);
        }
        r--;
      }

      if (l < c) {
        for (i = r - 1; i >= k; --i) {
          res.add(matrix[i][l]);
        }
        l++;
      }
    }
    return res;
  }
}
