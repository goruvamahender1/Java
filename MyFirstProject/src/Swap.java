import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int start,int end){
        int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


    }
}
