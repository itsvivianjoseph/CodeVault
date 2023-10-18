package others;

import java.util.HashMap;

class RomanToInt {
    public int romanToint(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int res = 0;
        int prev = 0;
        for(int i=s.length()-1;i>=0;i--){
            int curr = hm.get(s.charAt(i));
            if(curr < prev) res -= curr;
            else res += curr;
            prev = curr;
        }
        return res;
    }
}
// for(int i=0;i<s.length();i++)
// {
//     char c1 = s.charAt(i);
//     if(i != s.length()-1){
//         char c2 = s.charAt(i+1);
//         if(c1 == 'I' && c2 == 'V') {
//             res += 4;
//             i = i+1;
//         }
//         else if(c1 == 'I' && c2 == 'X'){
//             res += 9;
//             i = i+1;
//         }
//         else if(c1 == 'X' && c2 == 'L'){
//             res += 40;
//             i = i+1;
//         }
//         else if(c1 == 'X' && c2 == 'C'){
//             res += 90;
//             i = i+1;
//         }
//         else if(c1 == 'C' && c2 == 'D'){
//             res += 400;
//             i = i+1;
//         }
//         else if(c1 == 'C' && c2 == 'M'){
//             res += 900;
//             i = i+1;
//         }
//         else{
//             if(hm.containsKey(s.charAt(i))) res+=hm.getOrDefault(s.charAt(i),1);
//         }
//     }
//     else{
//         if(hm.containsKey(s.charAt(i))) res+=hm.getOrDefault(s.charAt(i),1);
//     }
// }