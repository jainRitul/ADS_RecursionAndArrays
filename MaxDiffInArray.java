class MaxDiffInArray {
    public static void main(String[] args) {
        int arr[] = {2,6,10,4,8,1};
        System.out.println(findMaxDiff(arr));
        System.out.println(findMaxDiffEfficient(arr));
    }
    static int findMaxDiffEfficient(int arr[]){
        int res = arr[1] - arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            res = Math.max(res,arr[i] - min);
            min = Math.min(min,arr[i]);
        }
        return res;
    }
    static int findMaxDiff(int arr[]){
          int n = arr.length;
          int max = Integer.MIN_VALUE;
          for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j] - arr[i] > max){
                    max = arr[j] - arr[i];
                }
            }
          }
          return max;
    }
}
