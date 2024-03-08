/**
 * SubarrayWithGivenSumSlidingWindow
 */
class SubarrayWithGivenSumSlidingWindow {

    public static void main(String[] args) {
        int arr[] = {4,8,12};
        int givenSum = 17;

        System.out.println(checkSubarrayExsist(arr,givenSum));
        System.out.println(checkSubarrayExsistEfficient(arr,givenSum));
    
    }
    static boolean checkSubarrayExsistEfficient(int arr[] ,int givenSum){
        int n = arr.length;
        int sum = 0,  s = 0;
        for(int e = 0;e<n;e++){
           sum += arr[e];

          while (sum > givenSum) {
            sum -= arr[s];
            s++;
          }

           if(sum == givenSum) return true;
        }
        return false;
    }
    static boolean checkSubarrayExsist(int arr[] ,int givenSum){
        int n= arr.length;

        for(int i=0;i<n;i++){
            int sum = 0;
            
            for(int j = i;j<n;j++){
                sum+= arr[j];
                if(sum == givenSum) return true;
            }
        }

        return false;
    }
}