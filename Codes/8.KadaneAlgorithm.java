import java.io.*;
import java.util.Scanner;

class KadaneAlgorithm {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Kadane obj = new Kadane();
      System.out.println(obj.maxSubarraySum(arr, n));
    }
    sc.close();
  }
}

class Kadane {
  int maxSubarraySum(int arr[], int n) {
    int max_so_far = arr[0];
    int curr_max = arr[0];
    for (int i = 1; i < n; i++) {
      curr_max = Math.max(arr[i], curr_max + arr[i]);
      max_so_far = Math.max(max_so_far, curr_max);
    }
    return max_so_far;
  }
}
