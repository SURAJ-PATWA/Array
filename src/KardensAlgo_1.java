public class KardensAlgo_1 {
    public static void main(String[] args) {
        int arr[]={-5,4,6,-3,4,-1};
        int maxsum=0;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum=currsum+arr[i];
            if(currsum>maxsum){
                maxsum=currsum;

            }
            if(currsum<0){
                currsum=0;
            }

        }
        System.out.println(maxsum);
    }
}
