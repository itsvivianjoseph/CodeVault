class New {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length;
        int[] res = new int[len];
        int start = 0;
        int end = len-1;
        for(int i = 0; i < len; i++) {
            res[i] = (i % 2 == 0) ? arr[end] : arr[start];
        }
        for(int i : res){ System.out.print(i + " "); }
    }
}