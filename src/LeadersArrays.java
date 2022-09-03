public class LeadersArrays {
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        int n= arr.length;
        int currValue=arr[n-1];
        System.out.print(currValue+" ");
        for(int i= n-2;i>=0;i--){
            if(arr[i]>currValue){
                currValue=arr[i];
                System.out.print(currValue+" ");
            }

        }
    }
}
