import java.util.*;

class CyclicRotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      int factor = 1;
      int[] newArr = cyclicRotation(arr, n, factor);
      for (int i = 0; i < n; i++) {
        System.out.print(newArr[i] + " ");
      }
      System.out.println();
    }
    sc.close();
  }

  public static int[] cyclicRotation(int[] arr, int n, int factor) {
    int[] newArr = new int[n];
    for (int i = 0; i < n; i++) {
      /* for left cyclic rotation */
      // newArr[i] = arr[(i + factor) % n];

      /* for right cyclic rotation */
      newArr[i] = arr[(i + n - factor) % n];
    }
    return newArr;
  }
}