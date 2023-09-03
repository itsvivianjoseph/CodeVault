public class NextLetter {
    static char nextGreatestLetter(char[] letters, char target) {
        if(target=='z' || (int)target>=(int)letters[letters.length-1]) return letters[0]; 
        // int diff=Integer.MAX_VALUE;
        // char letter='a';
        // for(int i=0;i<letters.length;i++)
        // {
        //     int value = (int) letters[i] - target;
        //     if(value>0 && value<diff){
        //         diff = value;
        //         letter = letters[i];
        //     }
        // }
        // return letter;
        int end = letters.length - 1;
        int start = 0;
        while (start <= end) 
        {
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) 
                {
                    end = mid - 1;
                } 
                else 
                {
                    start= mid + 1;
                }
        }
        return letters[start%letters.length];    
    }
    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[] {'x','x','y','y'},'w'));
    }
}
