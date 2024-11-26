public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int x =6;
        System.out.println(binarySearch(x,arr));
    }
    public static int binarySearch(int x,int[] arr){
        int l = 0;
        int r = arr.length-1;
        int mid = (l+r)/2;
        while (l<=r) {
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                l = arr[mid + 1];
                mid = (l+r)/2;
            }
            else if(arr[mid] > x) {
                r = arr[mid - 1];
                mid = (l+r)/2;
            }
        }
        return -1;
    }
}
