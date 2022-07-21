package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z\\d]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(s);
        System.out.println(stringBuilder);
        if(s.equals(stringBuilder.toString())){
            return true;
        }
        return false;

    }
}
