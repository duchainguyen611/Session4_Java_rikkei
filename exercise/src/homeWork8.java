import java.util.Scanner;

public class homeWork8 {
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

        System.out.print("Nhap gia tri updateValue: ");
        int updateValue = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap gia tri updateIndex: ");
        int updateIndex = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            if(i == updateIndex){
                arr[i] = updateValue;
            }
        }

        for (int i = 0; i < n ; i++) {
            System.out.printf("%3d", arr[i]);
        }
    }
}
