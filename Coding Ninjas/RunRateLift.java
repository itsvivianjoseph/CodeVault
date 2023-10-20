public class RunRateLift {
    static int liftStruggle(int d) {
        if(d==0) return 0;
        if(d%3==0) return (int)d/3;
        int three = 0 , two = 0;
        int i = (int)d/3;
        System.out.println(i);
        for(;i>=0;i--){
            if((d-(i*3))%2==0) {
                three = i;
                two = (int)(d-(i*3))/2;
                break;
            }
        }
        System.out.println("three "+three);
        System.out.println("two "+two);
        return three+two;
    }
    public static void main(String[] args) {
        System.out.println(liftStruggle(25));
    }
}