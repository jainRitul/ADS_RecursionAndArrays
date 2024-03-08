class EquilibriumPoint {
    public static void main(String[] args) {
      int arr[] = {4,2,2};
      System.out.println(checkIsEquilibriumPoint(arr));
      System.out.println(checkIsEquilibriumPointEfficient(arr));
    }
    static boolean checkIsEquilibriumPointEfficient(int arr[]){
        int  n  =arr.length;
        int rs =0;
        for(int i=0;i<n;i++){
          rs += arr[i];
        }
        int ls = 0;
        for(int i=0;i<n;i++){
           rs -= arr[i];
           if(ls == rs) return true;

           ls += arr[i];
        }return false;
    }
    static boolean checkIsEquilibriumPoint(int arr[]){
        int n = arr.length;

        for(int i = 0;i<n;i++){
            int left = 0;
            int right = 0;

            for(int j = i-1;j>=0;j--){
                left += arr[j];
            }
            for(int k = i+1;k<n;k++){
                right += arr[k];
            }

            if(left == right) return true;
        }
        return false;
    }

}
