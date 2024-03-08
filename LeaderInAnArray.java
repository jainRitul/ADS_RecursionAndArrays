import java.util.ArrayList;

class LeaderInAnArray {
    public static void main(String[] args) {
        int arr[] = {7,10,4,5,3,6,4};
        learderInarr(arr);

        learderInarrEfficient(arr);
    }
    static void learderInarrEfficient(int arr[]){
        int n = arr.length;
        int curr_ldr = arr[n-1];
        System.out.print( curr_ldr +" ");
        for(int i = n-2;i >= 0 ;i--){
             
            if(curr_ldr < arr[i]){
                curr_ldr = arr[i];
                System.out.print(curr_ldr + " ");
            }
        }
    }
    static void learderInarr(int arr[]){
       
        int n = arr.length;
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0;i<n;i++){
          
          for(int j = i+1;j<n;j++){

             if(arr[i] <= arr[j])
               break;

             if(j == n-1)  
              ans.add(arr[i]);
          }

         
         
        }
        ans.add(arr[n-1]);
        for(int i = 0 ;i<ans.size();i++){
            System.out.println(ans.get(i)+ " ");
        }

    }
}
