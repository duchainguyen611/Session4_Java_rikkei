import java.util.Scanner;

public class homeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu cua n:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        for (int i = 0; i < n ;i++){
            System.out.printf("arr[%d] =", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }


        int min = arr[0];
        int max = arr[0];




        for (int i = 1; i < n; i++) {
            if (max < arr[i])
            {
                max = arr[i];
            }
            if (min > arr[i])
            {
                min = arr[i];
            }
        }


        System.out.printf("Gia tri lon nhat la: %d\nGia tri nho nhat la: %d", max, min);

    }
}
