import java.util.*;

class MedianMatrix {
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
    int res = getMedian(matrix, r, c);
    System.out.println(res);
    sc.close();
  }

  private static int getMedian(int[][] matrix, int r, int c) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < r; i++) {
      if (matrix[i][0] < min)
        min = matrix[i][0];

      if (matrix[i][c - 1] > max)
        max = matrix[i][c - 1];
    }
    int desired = (r * c + 1) / 2;
    while (min < max) {
      int mid = min + (max - min) / 2;
      int place = 0;
      int get = 0;
      for (int i = 0; i < r; ++i) {
        get = Arrays.binarySearch(matrix[i], mid);
        if (get < 0)
          get = Math.abs(get) - 1;
        else {
          while (get < matrix[i].length && matrix[i][get] == mid)
            get += 1;
        }
        place = place + get;
      }
      if (place < desired)
        min = mid + 1;
      else
        max = mid;
    }
    return min;
  }
}
