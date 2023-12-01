import java.util.Scanner;


public class homeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("a[%d] = ", i + 1);
            arr[i] = scanner.nextInt();
        }

        System.out.print("Cac gia tri trong mang la:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%3d", arr[i]);
        }
    }
}
