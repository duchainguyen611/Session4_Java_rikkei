import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong mang 2 chieu:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot mang 2 chieu:");
        int col = Integer.parseInt(scanner.nextLine());

        float[][] arr = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d] =", i, j);
                arr[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        System.out.print("Cac so chan trong mang la:");
        float sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.printf("%3.2f", arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.printf("\nTong la: %.2f",sum);
    }
}
