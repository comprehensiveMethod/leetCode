import FurthestBuildingYouCanReach.Solution;

public class Main {
    public static void main(String[] args) {
        int heights[] = {4,12,2,7,3,18,20,3,19};
        int bricks = 10;
        int ladders = 2;
        Solution solution = new Solution();
        System.out.println(solution.furthestBuilding(heights,bricks,ladders));
    }
}
