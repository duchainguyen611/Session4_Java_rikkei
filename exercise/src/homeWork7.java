import java.util.Scanner;

public class homeWork7 {
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

        System.out.print("Nhap gia tri addValue: ");
        int addValue = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap gia tri addIndex: ");
        int addIndex = Integer.parseInt(scanner.nextLine());

        if (addIndex <= n) {
            int[] newArr1 = new int[n + 1];
            for (int i = 0; i < addIndex; i++) {
                newArr1[i] = arr[i];
            }
            for (int i = addIndex + 1; i < n; i++) {
                newArr1[i] = arr[i-1];
            }
            newArr1[addIndex] = addValue;
            for (int i = 0; i < n + 1; i++) {
                System.out.printf("%3d", newArr1[i]);
            }

        } else {
            int[] newArr2 = new int[addIndex];

            for (int i = 0; i < n; i++) {
                newArr2[i] = arr[i];
            }

            newArr2[addIndex-1] = addValue;
            for (int i = 0; i < addIndex; i++) {
                System.out.printf("%3d", newArr2[i]);
            }
        }

    }
}
