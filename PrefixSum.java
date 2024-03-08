class PrefixSum  {
    static int arr[] = {2,3,1,7,4};
    static int temp[] = new int[arr.length];
    public static void main(String[] args) {
        preProcssing(temp,arr);
        int sum = getSum(2,4);
        System.out.println(sum);
    }
    static void preProcssing(int temp[],int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
            temp[i] = sum;
        }
    }

    static int getSum(int s,int e){
        if(s==0)
         return temp[e];
        else 
          return  temp[e] - temp[s-1];
    }
}
