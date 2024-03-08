class MaxCircularSumSubarr {
    //there is some issue with this code 
    public static void main(String[] args) {
        int arr[] = {3,-4,5,6,-8,7};
        // System.out.println(findmaxCircularSum(arr));
        System.out.println(findmaxCircularSumEfficient(arr));
    }
    static int findmaxCircularSumEfficient(int arr[]){
        int n = arr.length;
        int max_sum = kadaneMax(arr,n);
        int min_sum = kadaneMin(arr,n);
        
        if(max_sum < 0) return max_sum;
        int sum = 0;
        for(int i = 0 ;i<n;i++){
            sum  += arr[i];
        }
        return Math.max(max_sum, sum - min_sum);
    }
    static int kadaneMax(int arr[] ,int n){
       int curr_max = arr[0];
       int curr_sum = arr[0];
       for(int i = 1;i<n;i++){
        curr_sum = Math.max(curr_sum, curr_sum+arr[i]);
        curr_max= Math.max(curr_max, curr_sum);
       }return curr_max;
    }
    static int kadaneMin(int arr[] ,int n){
       int curr_min = arr[0];
       int curr_sum = arr[0];
       for(int i =1;i<n;i++){
        curr_sum = Math.min(curr_sum, curr_sum+arr[i]);
        curr_min= Math.min(curr_min, curr_sum);
       }return curr_min;
    }

 
    static int findmaxCircularSum(int arr[]){
        int res = arr[0];
        int n = arr.length;

        for(int i =0;i<n;i++){
            int curr_sum = arr[i];
            int curr_max = arr[i];

            for(int j = 1;j<n;j++){
               int ind = (i+j) % n;

               curr_sum += arr[ind];
               curr_max = Math.max(curr_sum , curr_max);
            }
            res = Math.max(res , curr_max);
        }return res;
    } 
}
