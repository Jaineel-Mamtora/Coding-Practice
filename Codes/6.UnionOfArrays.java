import java.util.*;

class UnionOfArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr1 = new int[n];
      int[] arr2 = new int[m];
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
      }
      for (int j = 0; j < m; j++) {
        arr2[j] = sc.nextInt();
      }
      int length = getUnionLength(arr1, arr2, n, m);
      System.out.println(length);
    }
    sc.close();
  }

  public static int getUnionLength(int[] arr1, int[] arr2, int n, int m) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(arr1[i]);
    }
    for (int j = 0; j < m; j++) {
      set.add(arr2[j]);
    }
    return set.size();
  }
}