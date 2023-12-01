import java.util.Scanner;

public class homeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua mang:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Nhap gia tri deleteIndex: ");
        int deleteIndex = Integer.parseInt(scanner.nextLine());


        int[] newArr = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < deleteIndex) {
                newArr[i] = arr[i];
            } else if (i > deleteIndex) {
                newArr[i - 1] = arr[i];
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%3d", newArr[i]);
        }
    }
}
