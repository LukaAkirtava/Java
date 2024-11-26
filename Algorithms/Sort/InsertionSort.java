import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }

        return array;
    }


    public static void main(String[] args) {
        int[] arr = {3,1,7,5,11,9};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
