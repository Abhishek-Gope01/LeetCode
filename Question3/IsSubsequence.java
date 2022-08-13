package Question3;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            char ch = s.charAt(i);
            char ch1 = t.charAt(j);
            if(ch == ch1){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if (i == s.length()) return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
