import java.io.*;
import java.util.*;

class Sort012 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    sort012(arr, n);
    sc.close();
    StringBuffer str = new StringBuffer();
    for (int i = 0; i < n; i++) {
      str.append(arr[i] + " ");
    }
    System.out.print(str);
  }

  public static void sort012(int a[], int n) {
    Map<Integer, Integer> count = new HashMap<>();
    count.put(0, 0);
    count.put(1, 0);
    count.put(2, 0);
    List<Integer> sortedArr = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
      count.put(a[i], count.get(a[i]) + 1);
    }
    for (int i = 0; i < count.get(0); i++) {
      sortedArr.add(0);
    }
    for (int i = 0; i < count.get(1); i++) {
      sortedArr.add(1);
    }
    for (int i = 0; i < count.get(2); i++) {
      sortedArr.add(2);
    }
    for (int i = 0; i < a.length; i++) {
      a[i] = sortedArr.get(i);
    }
  }
}