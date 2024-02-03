public class isdiv {
    public static void main(String[] args) {
        int[] ipone = {20, 7};
        int[] iptwo = {11, 5};
        int[] op = new int[2];
        boolean onedivides = false;
        boolean twodivides = false;

        for (int i = 1; i <= 1000; i += 2) {
            if (((ipone[0] + i) % iptwo[0] == 0) && !onedivides) {
                onedivides = true;
                op[0] = i;
            }
            if ((ipone[1] + i) % iptwo[1] == 0 && !twodivides) {
                twodivides = true;
                op[1] = i;
            }
            if (onedivides && twodivides) break;
        }

        if (op[0] == 0 || op[0] > 2) {
            if ((ipone[0] + 2) % iptwo[0] == 0) op[0] = 2;
        }

        if (op[1] == 0 || op[1] > 2) {
            if ((ipone[1] + 2) % iptwo[1] == 0) op[1] = 2;
        }

        if (op[0] != 0) System.out.println(op[0]);
        if (op[1] != 0) System.out.println(op[1]);
    }
}
