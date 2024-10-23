import java.util.Scanner;

public class Recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static int power(int x,int y){
        if (y == 0) {
            return 1;
        } else {
            return x*power(x,y-1);
        }
    }
    public static int fibonacci(int n){
        if (n<=1){
            return 1;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void fact(int n, int i) {
        if (n == 1) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
            fact(n / i, i);
        } else {
            fact(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter rows:");
//        int row = scanner.nextInt();
//
//        System.out.println("enter columns:");
//        int column = scanner.nextInt();
//
//        int[][] arr = new int[row][column];
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                if (i == j) {
//                    arr[i][j] = 0;
//                }
//                if (i > j) {
//                    arr[i][j] = 1;
//                }
//                if (i < j) {
//                    arr[i][j] = 2;
//                }
//
//            }
//        }
//            for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.print("\n");
//        }

        System.out.println("enter rows:");
        int row = scanner.nextInt();

        System.out.println("enter columns:");
        int column = scanner.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("enter increment number: ");
        int k = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("enter number " + "[" + i + "]" + "[" + j + "]"+" :");
                int temp = scanner.nextInt();
                arr[i][j]=temp+k;
            }
        }
        //printer
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.print("\n");
        }

    }


}
