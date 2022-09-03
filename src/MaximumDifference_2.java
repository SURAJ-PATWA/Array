public class MaximumDifference_2 {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1 };
        int n=arr.length;
        int maxValue=arr[1]-arr[0];
        int minValue=arr[0];
        for(int j=1;j<n;j++){
            maxValue=Math.max(maxValue,arr[j]-minValue);
            minValue=Math.min(minValue,arr[j]);
        }
        System.out.println(maxValue);
    }
}
