public class kardensAlgo_2 {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        int sum=arr[0],res=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(sum+arr[i],arr[i]);
            res=Math.max(res,sum);

        }
        System.out.println(res);
    }
}
