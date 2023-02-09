public class leftRotateArrayByOnePos {

    static void simple(int[] input)
    {
        int shift = input[0];
        for(int i=0;i<input.length-1;i++)
        {
            input[i]=input[i+1];
        }
        input[input.length-1] = shift;
        for(int i=0;i<input.length;i++) System.out.print(input[i] +" ");
    }
    public static void main(String[] args) {
        int[] input = {0,1,2,3,4,5,6,7};
        if(input.length==1) System.out.println("shifted!");
        else simple(input);
    }
}
