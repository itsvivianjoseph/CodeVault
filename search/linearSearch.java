import javax.swing.text.html.HTMLDocument.RunElement;

class linearSearch
{
    static void linearsearch(int[] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key) {
            System.out.println("key found!");
            return;
        }
        }
        System.out.println("key not found!");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,26,3};
        int key = 1;
        linearsearch(arr,key);
    }
}