import java.util.Scanner;

public class Task2 {

    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { // ввод можно
            arr[i] = sc.nextInt();
        }

        double avg = (double) sum(arr, n) / n;
        System.out.println(avg);
    }
}