package CheckArrayFormationThroughConcatenation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int [] i:pieces) {
            for (int b:i) {
                boolean check = false;
                for (int arra:arr) {
                    if(b==arra) check=true;
                }
                if(!check) return false;
            }
        }
        List<String> array = new ArrayList<String>();
        Arrays.stream(arr).forEach(x->array.add(""+x));
        List<String> searchedArray = new ArrayList<>();
        String sum = array.toString();
        Arrays.stream(pieces).forEach(x->searchedArray.add(arrToString(x)));
        for (String s:searchedArray) {
            if(!sum.contains(s))return false;
        }
        return true;
    }
    public String arrToString(int[] arr){
        String s = "";
        for (int a:arr) {
            s+=a+", ";
        }
        s = s.substring(0,s.length()-2);
        return s;
    }
}
