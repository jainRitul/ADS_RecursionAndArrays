class PrintingAllPermutations {
    public static void main(String[] args) {
        String s = "abcd";
        printPermutation(s,0);
    }
    static void printPermutation(String s,int i){
        if(i == s.length() -1)
        {
            System.out.println(s + " ");
            return ;
        }

        for(int j = i; j<s.length(); j++){
        
           s = swap(s,i,j);
           printPermutation(s, i+1);
           s = swap(s,i,j);
        }
    }
    static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
