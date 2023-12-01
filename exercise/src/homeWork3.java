import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong mang 2 chieu:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot mang 2 chieu:");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d] =", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("\n In giá trị các phần tử mảng theo ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
