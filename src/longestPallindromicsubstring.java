import java.util.ArrayList;

class longestPallindromicsubstring
{
    static boolean isit(String x)
    {
        String y = "";
        for(int i=x.length()-1;i>=0;i--)  y+=x.charAt(i);
        if(x.equals(y)) return true;
        return false;
    }
    public static String longestPalindrome(String input) 
    {
        String check = "";
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<input.length()-1;i++)
        {
            check+=input.charAt(i);
            for(int j=i+1;j<input.length();j++)
            {
                check+=input.charAt(j);
                if(check.charAt(0)==check.charAt(check.length()-1)) if((isit(check))&&(!arr.contains(check))) arr.add(check);
            }
            check="";
        }
        int large = 0;
        String largestString = "";
        for(int i=0;i<arr.size();i++)
        {
            if((arr.get(i)).length()>large) 
            {
                large=arr.get(i).length();
                largestString=arr.get(i);
            }
        }
        if(large!=0) return largestString;
        else return largestString+=input.charAt(0);
    }
    public static void main(String[] args) {
        String input = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
        System.out.println(longestPalindrome(input));
    }
}
