class EvenOddSubarray {
    public static void main(String[] args) {
        int arr[] = {14,8,9,7};
        System.out.println(longestEvenOddArray(arr));
    }

    static int longestEvenOddArray(int arr[]){
         int n = arr.length;
         int curr = 1;
         int res = 1;
         for(int i = 1;i<n;i++){
           
            if((arr[i-1] % 2 == 0  && arr[i] % 2 !=0) 
                    || (arr[i-1] % 2 != 0  && arr[i] % 2==0)){
            curr++; 
            }  else curr = 1;
            res = Math.max(res,curr);
         }return res;
    }
}
