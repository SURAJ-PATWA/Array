public class StockBuySell {
    public static void main(String[] args) {
        int arr[]={5,2,6,1,4,7,3,6};
        int profit=0;
        for (int j=1;j<arr.length;j++){
            if(arr[j]>arr[j-1]){
                profit=profit+(arr[j]-arr[j-1]);
            }
        }
        System.out.println(profit);
    }
}
