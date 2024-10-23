import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //to output on a console
        int[] array = {1,2,3,4,4};
        int[][] array2D = {{1,2},{3,4}};
        Scanner scanner = new Scanner(System.in);
        duplicate(array);
        arrayPrinter(array);
        delete(array,0);
        fibonacciRecursive(4);
        combine(array2D);
        moveRight(array);
        scanner.close();
    }
    public static void arrayPrinter(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static boolean duplicate(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = i; j < arr.length; j++) {
            if (arr[i]==arr[j] && i !=j){
                return true;
            }
        }
    }
    return false;
    }
    public static void fibonacci(int num){
        int num1 = 0;
        int num2 = 1;
    for (int i = 2; i < num ; i++) {
        int next = num1 + num2;
        num1=num2;
        num2=next;
    }
        System.out.println(num1+num2);
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void delete(int[] arr, int n){
        if (arr.length<=n || n<0){
            System.out.println("out of bound");
        } else{
            for (int i = 0; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
        }
        System.out.println(Arrays.toString(arr));
    }

        public static void combine(int[][] arr){
            int rows = arr.length;
            int cols = arr[0].length;
            int[] array = new int[rows*cols];
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    array[k]=arr[i][j];
                    k++;
                }
            }
            System.out.println(Arrays.toString(array));
        }
        public static void moveRight(int[] arr){
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;

            System.out.println(Arrays.toString(arr));
        }

    public static int[][] pascal(int rows){
        int[][] triangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
    public static void ArraySort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int factorial(int n){
        int x = 1;
        for (int i = 1; i <= n; i++) {
            x = x*i;
            System.out.println(x);
        }
        return x;
    }

    public static int sumOfNums(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    public static void adder(int n){
        int x = 0;
        for (int i = 1; i <= n ; i++) {
            x += i;
        }
        System.out.println(x);
    }

}
