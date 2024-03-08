class MaxSumOfKConsecutiveEle {
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        int k =4;
        System.out.println(maxSumOfWindowSizeK(arr,k));
        System.out.println(maxSumOfWindowSizeKEfficient(arr,k));
    }
    static int maxSumOfWindowSizeKEfficient(int arr[] ,int k){
        int n = arr.length;
        int curr = 0;
        for(int i=0;i<k;i++){
           curr+= arr[i];
        }
        int res = curr;

        for(int i=k;i<n;i++){
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res,curr);
        }
        return res;
    }
    static int maxSumOfWindowSizeK(int arr[] ,int k){
       int n = arr.length;
       int curr_max = Integer.MIN_VALUE;
       for(int i = 0 ;i+k-1<n;i++)
       {

         int curr_sum = 0;
         for(int j = 0;j<k;j++)
         {
            curr_sum += arr[j+i];
         }

         curr_max = Math.max(curr_max,curr_sum);
       }
       return curr_max;

      
    }
}
