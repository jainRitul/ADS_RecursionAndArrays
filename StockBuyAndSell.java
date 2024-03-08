class StockBuyAndSell {
    public static void main(String[] args){
       int arr[] = {10,20,30};
       System.out.println(maxProfit(arr,0,arr.length-1));
       System.out.println(maxProfitEfficient(arr));
    }
    static int maxProfitEfficient(int arr[]){
        int profit = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i]-arr[i-1];
            }

        }
        return profit;
    }
    static int maxProfit(int arr[],int start,int end){
        if(end <= start)
          return 0;

        int profit = 0;
        
        for(int i = start;i < end;i++){
           for(int j = i+1;j<=end;j++){
            if(arr[j] > arr[i] ){
                int curr_pro = arr[j] - arr[i] + maxProfit(arr,start,i-1) +
                                                 maxProfit(arr,j+1,end);

                profit = Math.max(curr_pro,profit);
            }
           }
        }return profit;
    } 

}
