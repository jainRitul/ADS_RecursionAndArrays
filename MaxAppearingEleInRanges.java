import java.util.Arrays;

class MaxAppearingEleInRanges {
    public static void main(String[] args) {
        int left[] = {1,2,4};          
        int right[] = {4,5,7};   
      
        System.out.println(maxAppearingEleInRange(left,right));    
        System.out.println(maxAppearingEleInRangeEfficient(left,right));    
    }
    static int maxAppearingEleInRangeEfficient(int left[],int right[]){
        int n =left.length;
        int freq[] = new int[101];
        for(int i =0;i<n;i++){ 
            
            freq[left[i]] ++;
            freq[right[i]+1] --;
        }

        int res = 0;
        for(int i=1;i<=100;i++){
          freq[i] = freq[i]+freq[i-1];
          if(freq[i] > freq[res]){
            res = i;
          }
        }
        return res;
    }
    static int maxAppearingEleInRange(int left[] ,int right[]){
        int n = left.length;
        int temp[] = new int[101];
        for(int i =0;i<n;i++){
           int s = left[i];
           int e = right[i];
           for(int j = s;j<=e;j++){
              temp[j] += 1;
           }
        }
        int ans = 0;
        for(int i = 1;i<=100;i++){
            if(temp[ans] < temp[i] ){
                ans = i;
            }
        }return ans;
    }
}
