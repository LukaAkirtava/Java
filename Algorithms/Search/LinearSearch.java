public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x =4;

    }
    public static int linearSearch(int x,int[] array){
        for (int i = 0; i < array.length; i++) {
            if (x==array[i]){
                return i;
            }
        }
        return -1;
    }
}
