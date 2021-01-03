import java.io.*;
import java.util.Scanner;

class MiddleOfThree {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.middle(A, B, C));
        }
        sc.close();
    }
}

class Solution {
    int middle(int A, int B, int C) {
        if ((A < B && B < C) || (C < B && B < A))
            return B;

        else if ((B < A && A < C) || (C < A && A < B))
            return A;

        else
            return C;
    }
}