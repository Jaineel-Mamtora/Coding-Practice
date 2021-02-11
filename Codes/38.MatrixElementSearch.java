import java.util.*;

class MatrixElementSearch {
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
    int target = sc.nextInt();
    boolean res = searchMatrix(matrix, target);
    System.out.println(res);
    sc.close();
  }

  private static boolean searchMatrix(int[][] matrix, int target) {
    int m = matrix.length, index = 0;
    while (index < m) {
      if (matrix[index][0] == target)
        return true;
      else if (matrix[index][0] < target)
        index++;
      else {
        break;
      }
    }
    index = index > 0 ? --index : index;
    for (int i = 0; i < matrix[0].length; i++) {
      if (matrix[index][i] == target)
        return true;
    }
    return false;
  }
}
