class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {0,0,0,8,0,5,0,10,0,20,0};

         //approach 1 efficient
         moveToEndEfficient(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
         }

         
        System.out.println();

        //approcah 2 inefficient
        moveZeroToEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void moveToEndEfficient(int arr[]){
        int n = arr.length;
        int count = 0; 
        for(int i=0;i<n;i++){
           if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;

            count++;
           }
        }
    }
    static void moveZeroToEnd(int arr[]){
      int n = arr.length;
     
      for(int i=0;i<n;i++){
        if(arr[i] == 0){
            for(int j=i+1;j<n;j++){
                if(arr[j] != 0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
      } 
    }
    
}
