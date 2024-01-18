class exmple{
    public static void main(String[] args) {
        String ip = "111";
        int start=0,end=ip.length()-1,count=0;
        char[] arr = ip.toCharArray();
        while(start<end){
            int mid = (start+end)/2;
            if(arr[start]=='1' && arr[end]=='1' && arr[mid]=='1' )
            {
                arr[start] = arr[end] = arr[mid] = '0';
                count++;
            }
            start++;
            end--;
        }
        System.out.println(count);
    }
}