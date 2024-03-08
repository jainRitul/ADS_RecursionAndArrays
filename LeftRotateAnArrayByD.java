import java.util.ArrayList;

class LeftRotateAnArrayByD{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        //approcah one
        leftRotateByD(arr,d);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();
        
        //approach 2
        leftRotateByDNaiveApproach(arr,d);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");


        System.out.println();
        
        //approach 3
        leftRotateByDEfficentApproach(arr,d);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }
    static void leftRotateByDEfficentApproach(int arr[],int d){
      reverse(arr, 0, d-1);
      reverse(arr, d,arr.length-1);
      reverse(arr, 0, arr.length-1);

    }
    static void reverse(int arr[] ,int low,int high){
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static void leftRotateByDNaiveApproach(int arr[],int d){
        int n = arr.length;
        for(int i=0;i<d;i++){
            leftRotateByOne(arr,n);
        }
    }
    static void leftRotateByOne(int arr[],int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    static void leftRotateByD(int arr[],int d){
        //o(n) 0(d)
        int a[] = new int[d];
        int i = 0;
        for(i=0;i<d;i++)
            a[i] = arr[i];

        for(i=d;i<arr.length;i++)
           arr[i-d] = arr[i];
    
        for(i=0;i<d;i++){
            arr[arr.length-d+i] = a[i];
        }   


    }
}