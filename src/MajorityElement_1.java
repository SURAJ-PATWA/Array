public class MajorityElement_1 {
    public static void main(String[] args) {
        int arr[]={8,8,6,6,6,4,6};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for( int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
                if(count>n/2){
                    System.out.println(i);
                }

                }

            }


        }
    }

