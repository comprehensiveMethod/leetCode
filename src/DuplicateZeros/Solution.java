package DuplicateZeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int buff=-1;
        boolean swap = false;
        List<Integer> array = new ArrayList<>();
        for (int a:arr) {
            if(a==0){
                array.add(a);
                array.add(a);
            }
            else array.add(a);
        }
        for(int i = 0; i<arr.length;i++){
            arr[i] = array.get(i);
        }
        array.clear();
    }
}
