class MaxConsecutiveOne {
    
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,0,1,0};
        System.out.println(countConsectiveOne(arr));
    }
    static int countConsectiveOne(int arr[]){
       
        int ans = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
          if(arr[i] == 0){
            count =0;
          }else{
             count++;
             ans = Math.max(count,ans);
          }
        }
       
        return ans;
    }
}
