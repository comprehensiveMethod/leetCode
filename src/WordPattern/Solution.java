package WordPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        char mass[] = pattern.toCharArray();
        ArrayList<String> row = new ArrayList<String>(Arrays.asList(s.split(" ")));
        if(mass.length != row.size()){
            return false;
        }
        for(int i = 0; i<mass.length;i++){
            for (int j = 0; j<mass.length;j++){
                if(mass[i]==mass[j]){
                    if(!row.get(i).equals(row.get(j))){
                        return false;
                    }
                }else if(row.get(i).equals(row.get(j))){
                    return false;
                }
            }
        }


        return true;
    }
}
