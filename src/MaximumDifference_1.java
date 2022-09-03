//import static sun.swing.MenuItemLayoutHelper.max;


public class MaximumDifference_1 {
    public static void main(String[] args) {
        int arr[]={2,3,6,4,8,1,10 };
        int n=arr.length;
        int res=arr[1]-arr[0];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        System.out.println(res);
    }
}
