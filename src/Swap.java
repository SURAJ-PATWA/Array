import java.util.Arrays;

public class Swap {

    public static void reverse(int arr[]){
        int start=0;int end=arr.length-1;
        //swap
        while(end > start){
            //swap start and end
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr)); //[56, 18, 9, 23, 3, 1]
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");        // 56 18 9 23 3 1
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,23,9,18,56};
        reverse(arr);

    }
}
