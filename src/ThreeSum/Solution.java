package ThreeSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> summary = new ArrayList<>();
        List<List<Integer>> indexes = new ArrayList<>();
        for(int i = 0;i<nums.length; i++){
            for(int j = 0; j<nums.length;j++){
                if(i==j){
                    continue;
                }
                for (int k = 0; k<nums.length; k++){
                    if(k==j){
                        continue;
                    }
                    if(i==k){
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> index = new ArrayList<>();
                        index.add(i);
                        index.add(j);
                        index.add(k);
                        indexes.stream().forEach(x->{if(x.containsAll(index)) index.add(5);});
                        if(index.size()==3){List<Integer> result = new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        summary.add(result);
                        indexes.add(index);};

                    }
                }
            }
        }
        return summary;
    }
}
