import java.util.Arrays;

public class MoveAllZero {
    public static void main(String[] args) {
        int arr[]={0,0,0,1,2,3};
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                //swap(arr[i],arr[count])
               int temp=arr[i];
               arr[i]=arr[count];
               arr[count]=temp;
               count++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
