class SubsetSumProblem {
    public static void main(String[] args) {
        int arr[] = {10,15,5,8,9,2,4,1};
        int n = arr.length;
        int sum = 15;
        System.out.println(countSubset(arr,n,sum));
    }
    static int countSubset(int arr[] ,int n,int sum){
        if(n==0)
           return (sum == 0) ? 1 : 0;
        
        return countSubset(arr,n-1,sum-arr[n-1])+countSubset(arr,n-1,sum);
    }
    
}
