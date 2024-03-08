class StockBuyAndSell(part 1) {
    public static void main(String[] args){
       int arr[] = {1,5,3,8,12};
       System.out.println(maxProfit(arr,0,arr.length));
    }
    static int maxProfit(int arr[],int start,int end){
       if(end <= start){
        return 0;
       }
       int n = arr.length;
       int profit
       for(int i=0;i<n;i++){
           for(int j =i+1;j<n;j++){
            if(arr[j] > arr[i]){
              int  curr_profit = arr[j] -arr[i] + maxProfit(arr,start,i-1) + maxProfit(arr,j+1,end);

              profit = Math.max(curr_profit,profit);
             } 

           }
       }
       return profit;
    }

}
