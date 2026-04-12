class Solution {
    public boolean isPalindrome(String s) {
        //two pointer
        String str1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String str = str1.toLowerCase();
        int startIdx = 0;
        int endIdx = str.length() -1;
        while(startIdx <= endIdx){
            char firstChar = str.charAt(startIdx);
            char lastChar = str.charAt(endIdx);
            if(firstChar != lastChar){
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }
}
