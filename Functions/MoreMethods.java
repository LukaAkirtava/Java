import java.util.Arrays;

public class MoreMethods {

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        for (int i = 2; i <= n; i++) {
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println(n1+n2);
        return n;
    }

    public static void factorial(int n){
        int x = 1;
        for (int i = 1; i <= n ; i++) {
            x = x*i;
        }
        System.out.println(x);
    }

    public static void arrayReverse(int[] arr){
        int[] newArr = new int[arr.length];
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            n--;
            newArr[i]=arr[n];
        }
        arrayPrinter(newArr);
    }
    public static void arrayPrinter(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    public static void maxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min: " + min + " Max:" + max);

    }

    public static void rotateArr(int[] arr){
        int last = arr[arr.length-1];
        for (int i = arr.length-1; 0 < i; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        System.out.println(Arrays.toString(arr));
    }

    public static int[][] transpose(int[][] arr){
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposed[j][i] = arr[i][j];
            }
        }
        return transposed;
    }

    public static void printer(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2){
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k <cols1 ; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }
    public static boolean palindrome(String string){
        string = string.replaceAll(" ","").toLowerCase();
        int n = string.length()-1;
        for (int i = 0; i <= string.length()/2-1; i++) {
            if (string.charAt(i) != string.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }

    public static void reverseString(String string){
        StringBuilder newString = new StringBuilder();
        for (int i = string.length()-1; i >= 0; i--) {
            newString.append(string.charAt(i));
        }
        newString.toString();
        System.out.println(newString);
    }

    public static boolean containsDigits(String string){
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCounts = new int[26];

        for (char c : str1.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            charCounts[c - 'a']--;
        }
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void removeVowel(String s){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u')){
                stringBuilder.append(c);
            }
        }
        stringBuilder.toString();
        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = {{2,2},{1,1},{1,1}};
        String str = "luka";
        removeVowel(str);

    }
}
