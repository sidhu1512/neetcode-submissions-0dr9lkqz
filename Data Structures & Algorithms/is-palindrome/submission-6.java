class Solution {
    public boolean isPalindrome(String s) {
        //need regex to replace non alphanumeric to "" and then replace " " to "" and then all lowercase
        //use two pointer to match 1st alsnt last till n+1/2 length
        int left =0, right = s.length()-1;
        while(left <right){
            while(left <right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left <right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }
}
