package TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i <nums.length;i++){
            for (int j = 0; j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j] == target){
                    if(i<j){
                        arr[0] = i;
                        arr[1] = j;
                        return arr;
                    }else{
                        arr[1] = i;
                        arr[0] = j;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }
}
