class MaxSumSubarr {
    public static void main(String[] args) {
        int arr[] = {2,-1,9,-3,-4,5};
        System.out.println(findMaxSumSubarr(arr));
        System.out.println(findMaxSumSubarrEfficient(arr));
    }
    static int findMaxSumSubarrEfficient(int arr[]){
        int res = arr[0];
        int maxEnding = arr[0];

        for(int i = 1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding + arr[i] , arr[i]);
            res = Math.max(maxEnding,res);
        }
        return res;
    }
    static int findMaxSumSubarr(int arr[]){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            int sum = 0;

            for(int j=i;j<n;j++){
                sum += arr[j];
                ans = Math.max(ans,sum); 
            }
        }
        return ans;
    }

}
