import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

class DuplicateNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int ans = findDuplicate(nums);
    System.out.print(ans);
    sc.close();
  }

  private static int findDuplicate(int[] nums) {
    int value = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() >= 2) {
        value = e.getKey();
        break;
      }
    }
    return value;
  }
}
