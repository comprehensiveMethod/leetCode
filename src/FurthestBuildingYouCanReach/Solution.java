package FurthestBuildingYouCanReach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        for(int i = 0;i<heights.length;i++){
            if(i==heights.length-1) return i;
            if(heights[i]>=heights[i+1]) continue;
            else{
                if(heights[i+1]-heights[i]<bricks){
                    bricks-=heights[i+1]-heights[i];
                    continue;
                }else if(ladders!=0){
                    ladders--;
                    continue;
                }else return i;
                }
            }
        return 0;
        }

}

