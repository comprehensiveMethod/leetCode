package LengthofLastWord;

import java.util.Collections;
import java.util.List;

public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            if(s.charAt(i)==' '&&count==0){
                continue;
            }
            if(s.charAt(i)==' '&& count!= 0)return count;
        }
        return count;
    }
}