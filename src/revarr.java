public class revarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] rev = new int[arr.length];
        int idx = 0;
        for(int i=arr.length-1;i<=0;--i){
            rev[idx] = arr[i];
            idx++;
        }
        for(int i : rev) {
            System.out.println(i);
        }
    }
}
