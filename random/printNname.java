//Print name N times using recursion
public class printNname {
    static int count;
    static void nNames(String name){
        if(count==0) return;
        count--;
        System.out.println(name);
        nNames(name);
    }
    public static void main(String[] args) {
        String name = "vivian";
        count =10;
        nNames(name);
    }
}
