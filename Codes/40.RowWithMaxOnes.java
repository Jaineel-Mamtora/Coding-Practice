import java.util.*;

class RowWithMaxOnes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    int res = getRowWithMaxOnes(matrix, n, m);
    System.out.println(res);
    sc.close();
  }

  private static int getRowWithMaxOnes(int[][] arr, int n, int m) {
    int maxRowIndex = -1;
    int currCol = m - 1;
    for (int i = 0; i < n; i++) {
      while (currCol >= 0 && arr[i][currCol] == 1) {
        currCol = currCol - 1;
        maxRowIndex = i;
      }
    }
    return maxRowIndex;
  }
}