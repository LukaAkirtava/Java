import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
//      in diagonal there is 0s on the right 2s and on the left side 1s
        System.out.println("enter rows:");
        int row = scanner.nextInt();

        System.out.println("enter columns:");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                if (i > j) {
                    arr[i][j] = 1;
                }
                if (i < j) {
                    arr[i][j] = 2;
                }

            }
        }
            for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.print("\n");
        }
            //increments all number with inputted number in 2D_array from previous code
            System.out.println("enter rows:");
            int row1 = scanner.nextInt();

            System.out.println("enter columns:");
            int column1 = scanner.nextInt();

            int[][] arr = new int[row1][column1];
            System.out.println("enter increment number: ");
            int k = scanner.nextInt();

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.println("enter number " + "[" + i + "]" + "[" + j + "]" + " :");
                    int temp = scanner.nextInt();
                    arr[i][j] = temp + k;
                }
            }
            //printer
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
