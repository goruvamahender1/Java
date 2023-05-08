public class MaxItemInrange {
    public static void main(String[] args) {
        int[] arr={1,90,56,89,100};
        range(arr,1,2); 

    }
    static void range(int[] arr,int index1,int index2){
        int max=arr[index1];
        for(int i=index1;i<=index2;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
