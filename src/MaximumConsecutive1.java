public class MaximumConsecutive1 {
    public static void main(String[] args) {
        int  arr[]={0,1,1,1,0,1,0};
        int count=0,res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;
                res=Math.max(res,count);
            }
        }
        System.out.println(res);
    }
}
