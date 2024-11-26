import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,7,5,11,9};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}

