import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua n:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] =", i + 1);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int i = 0; i < n; i++) sum += arr[i];
        System.out.printf("Gia tri trung binh cong cua cac phan tu trong mang la: %.2f",(float)sum/n);

    }
}
