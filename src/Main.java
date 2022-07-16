import WordPattern.Solution;

public class Main {
    public static void main(String[] args) {
        String pattern = "aaa", s = "aa aa aa aa";
        Solution solution = new Solution();
        System.out.println(solution.wordPattern(pattern,s));

    }
}
