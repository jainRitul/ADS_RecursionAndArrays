class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {3,0,2,0,4};
        System.out.println(maxWater(arr));
    }
    static int maxWater(int arr[]){

        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }

        right[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int sum = 0;
        for(int i=1;i<n-1;i++){
          sum += Math.min(left[i], right[i]) - arr[i];
        }
         return sum;
        
    }
}
