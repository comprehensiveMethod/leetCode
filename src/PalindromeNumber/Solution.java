package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        char[] arr = String.valueOf(x).toCharArray();

        for(int i = 0; i<arr.length;i++){
            if(arr[i] != arr[arr.length-i-1]) return false;
        }
        return true;
    }
}
