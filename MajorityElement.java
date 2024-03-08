class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {6,8,4,8,8};
        System.out.println(findMajorityEle(arr));
        System.out.println(findMajorityEleEfficient(arr));

    }
    static int findMajorityEleEfficient(int arr[]){
        int n = arr.length;
        int maj = arr[0];
        int count = 1;

        for(int i = 1;i<n;i++){
            if(arr[i] == maj)
            {
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                maj = arr[i];
                count = 1;
            }
        }
       
        return maj;
          
        
    }
    static int findMajorityEle(int arr[]){
        int n = arr.length;
       for(int i = 0;i<n;i++){
           int count = 1;
           for(int j = i+1;j<n;j++){
               if(arr[i] == arr[j])
                 count++;
           }
           if(count > n/2)
             return arr[i];
       }return -1;
    }
}
