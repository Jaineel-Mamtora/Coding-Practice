import java.io.*;
import java.util.Scanner;

class Driver {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine().trim();
            new Reverse();
            System.out.println(Reverse.reverseWord(str));
        }
        sc.close();
    }
}

class Reverse {
    public static String reverseWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}