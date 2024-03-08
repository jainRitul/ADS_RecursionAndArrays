class MinGrpFlipsInBinaryArr {
   public static void main(String[] args) {
    int arr[] = {0,0,1,0,0,1,1,0,1};
    minflips(arr);
    minflipsApprocah2(arr);
   }
   static void minflipsApprocah2(int arr[]){
    int n = arr.length;

    for(int i =1;i<n;i++){
        if(arr[i] != arr[i-1]){
            if(arr[i] != arr[0]){
                System.out.print("from " + i);
            }
            else{
                System.out.println("to " + (i-1));
            }
        }
    }
    if(arr[n-1] != arr[0]) {
        System.out.println("to"+(n-1));
    }
   }
   static void minflips(int arr[]){
    int n =arr.length;
    int firstEle = arr[0];
    int i = 1;
    while(i<n){
        if(firstEle != arr[i]){
            int startInd = i;
            while(i<n && firstEle != arr[i]){
                  i++;
            }
            System.out.println("from " + startInd + "," +(i-1));
        }i++;
    }

   
   }
      
}
