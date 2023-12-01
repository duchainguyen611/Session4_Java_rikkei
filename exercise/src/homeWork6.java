import java.util.Scanner;

public class homeWork6 {
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

        System.out.print("Nhap 1 so:");
        int findNumber = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        System.out.print("Chi so cac phan tu co gia tri = so vua nhap:");
        for (int i = 0; i < n; i++) {
            if (arr[i] == findNumber) {
                System.out.printf("%2d",i);
                sum += arr[i];
            }
        }
        System.out.printf("\nTong cac phan tu = %d",sum);

    }
}
