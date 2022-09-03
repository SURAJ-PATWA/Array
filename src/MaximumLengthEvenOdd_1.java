public class MaximumLengthEvenOdd_1 {
    public static void main(String[] args) {
        int arr[]={5,10,20,6,3,8};
       int res=1;
            int curr=1;
            for(int j=1;j<arr.length;j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    curr++;
                    res = Math.max(res, curr);
                }
            else
curr=1;
            }
        System.out.println(res);

        }
    }

