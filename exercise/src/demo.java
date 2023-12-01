import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        int choice;
        do {
            System.out.print(
                    "\n**MENU**\n" +
                            "1.Nhập giá trị các phần tử mảng\n" +
                            "2.In giá trị các phần tử mảng\n" +
                            "3.In giá trị các phần tử có giá trị chẵn và tính tổng\n" +
                            "4.In giá trị các phần tử có chỉ số lẻ và tính tổng\n" +
                            "5.In giá trị các phần tử là số nguyên tố\n" +
                            "6.Sắp xếp mảng tăng dần\n" +
                            "7.Nhập 1 số và thống kê số đó xuất hiện bao nhiêu lần trong mảng\n" +
                            "8.Thoát");
            System.out.print("\nNhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("arr[%d] = ", i);
                        arr[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("In giá trị các phần tử mảng: ");
                    for (int i = 0; i < n; i++) {
                        System.out.printf("%3d", arr[i]);
                    }
                    break;
                case 3:
                    int sum1 = 0;
                    System.out.println("In giá trị các phần tử có giá trị chẵn và tính tổng: ");
                    for (int i = 0; i < n; i++) {
                        if (arr[i] % 2 == 0) {
                            sum1 += arr[i];
                            System.out.printf("%3d", arr[i]);
                        }
                    }
                    System.out.printf("\nTong = %d", sum1);
                    break;
                case 4:
                    int sum2 = 0;
                    System.out.println("In giá trị các phần tử có chỉ số lẻ và tính tổng: ");
                    for (int i = 0; i < n; i++) {
                        if (i % 2 != 0) {
                            sum2 += arr[i];
                            System.out.printf("%3d", arr[i]);
                        }
                    }
                    System.out.printf("\nTong = %d", sum2);
                    break;
                case 5:
                    System.out.println("In giá trị các phần tử là số nguyên tố: ");
                    boolean isPrime = true;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] <= 1) isPrime = false;
                        for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                            if (arr[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) System.out.printf("%3d", arr[i]);
                    }
                    break;
                case 6:
                    int teamp;
                    System.out.println("Sắp xếp mảng tăng dần: ");
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i] > arr[j]) {
                                teamp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = teamp;
                            }
                        }
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.printf("%3d", arr[i]);
                    }
                    break;
                case 7:
                    System.out.print("Nhap 1 so:");
                    int newNumber = Integer.parseInt(scanner.nextLine());
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == newNumber) count++;
                    }
                    System.out.printf("\nSo %d xuat hien trong mang %d lan", newNumber, count);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.print("Moi nhap tu 1 den 8");
                    break;
            }
        } while (true);
    }
}
