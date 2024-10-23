import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] triangle = pascal(input);
        for (int i = 0; i < input; i++) {
            System.out.print("n=" + i + " | ");
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] pascal(int n){
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i]=new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j]= triangle[i-1][j]+triangle[i-1][j-1];
            }
        }
        return triangle;
    }


}
