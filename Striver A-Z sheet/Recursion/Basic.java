package Recursion;
class Basic{
    public static void main(String[] args){
        printNameNTimes("vivian",5);
        printLinearlyFromOneToN(5);
        printNToOne(5);
    }
    static void printNToOne(int n){
        if(n==0) return ;
        System.out.println(n);
        printNToOne(n-1);
    }
    static void printLinearlyFromOneToN(int n){
        if(n==0) return;
        printLinearlyFromOneToN(n-1);
        System.out.println(n);
    }
    static void printNameNTimes(String name,int n){
        if(n==0) return;
        System.out.println(name);
        printNameNTimes(name,n-1);
    }
}