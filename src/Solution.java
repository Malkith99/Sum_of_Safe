import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int num = 1;
        for (int k = 0; k < t; k++) {
            int N = scanner.nextInt();
            if (N == 1) {
                System.out.println(1);
            } else if (N == 2) {
                System.out.println(-1);
            } else if (N == 3) {
                int[][] ar={{1, 6, 2}, {7, 3, 8}, {4, 9, 5}};

                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++)
                        System.out.print(ar[i][j] + " ");
                    System.out.println();
                }continue;
            } else {
                int[][] ar = new int[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (j % 2 == 0) {
                            ar[i][j] = num;
                            num++;
                        }
                    }
                }
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (j % 2 != 0) {
                            ar[i][j] = num;
                            num++;
                        }
                    }
                }
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++)
                        System.out.print(ar[i][j] + " ");
                    System.out.println();
                }
            }
        }
    }
}
