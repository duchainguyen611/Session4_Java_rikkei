import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so dong mang 2 chieu:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap so cot mang 2 chieu:");
        int col = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][col];

        do {
            System.out.print("\n********MENU**********\n" +
                    "1. Nhập giá trị các phần tử mảng\n" +
                    "2. In giá trị các phần tử mảng theo ma trận\n" +
                    "3. In giá trị các phần tử trên đường biên và tính tổng\n" +
                    "4. In giá trị các phần tử trên đường chéo chính và chéo phụ, tính tổng\n" +
                    "5. Tìm giá trị lớn nhất và nhỏ nhất trong mảng\n" +
                    "6. Sắp xếp mảng giảm dần theo cột\n" +
                    "7. Thống kê các phần tử có giá trị lẻ chia hết cho 3\n" +
                    "8. Thoát\n");
            System.out.print("Nhap lua chon:");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập giá trị các phần tử mảng:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("arr[%d][%d] =", i, j);
                            arr[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n In giá trị các phần tử mảng theo ma trận:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            System.out.printf("%4d", arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int sum1 = 0;
                    System.out.println("In giá trị các phần tử trên đường biên:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                                sum1 += arr[i][j];
                                System.out.printf("%4d", arr[i][j]);
                            }
                        }
                    }
                    System.out.printf("\nTong = %d",sum1);
                    break;
                case 4:
                    int sum2 = 0;
                    if(row != col){
                        System.out.println("Khong co duong cheo chinh va cheo phu");
                    }else {
                        System.out.println("In giá trị các phần tử trên đường chéo chính:");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i == j) {
                                    sum2 += arr[i][j];
                                    System.out.printf("%4d", arr[i][j]);
                                }
                            }
                        }
                        System.out.println("\nIn giá trị các phần tử trên đường chéo phu:");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                if (i + j == row-1) {
                                    sum2 += arr[i][j];
                                    System.out.printf("%4d", arr[i][j]);
                                }
                            }
                        }
                        System.out.printf("\nTong = %d",sum2);
                    }
                    break;
                case 5:
                    int max =  arr[0][0];
                    int min =  arr[0][0];
                    System.out.println("In giá trị các phần tử trên đường biên:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if (max < arr[i][j]) {
                                max = arr[i][j];
                            }
                            if (min > arr[i][j]){
                                min = arr[i][j];
                            }
                        }
                    }
                    System.out.printf("\nMax = %d\nMin = %d",max,min);
                    break;
                case 6:
                    int temp;
                    System.out.println("\n Sắp xếp mảng giảm dần theo cột:");
                    for (int j = 0; j < col; j++) {
                        for (int i = 0; i < row-1; i++) {
                            for (int k = i+1; k <row ; k++) {
                                if (arr[i][j]<arr[k][j]){
                                    temp = arr[i][j];
                                    arr[i][j] = arr[k][j];
                                    arr[k][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("\n Sắp xếp thành công");
                    break;
                case 7:
                    System.out.println("Thống kê các phần tử có giá trị lẻ chia hết cho 3:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < col; j++) {
                            if(arr[i][j]%2!=0 && arr[i][j]%3==0){
                                System.out.printf("%4d", arr[i][j]);
                            }
                        }
                    }
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
