class CheckArrPartitionInThree {
    public static void main(String[] args) {
        int arr[] = {5,2,6,1,1,1,1,4};
        System.out.println(canBePartitionInThreeWithEqualSum(arr));
    }
    static boolean canBePartitionInThreeWithEqualSum(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        if(sum % 3 != 0) return false;
        int x = sum/3;

        int count = 0;
        int currSum = 0;
        for(int i=0;i<n;i++)
        {
          currSum += arr[i];
          if(currSum == x) {
            count++;
            currSum = 0;
          }
        
        }
        if(count >= 3)
        return true;
        return false;
    }
}
