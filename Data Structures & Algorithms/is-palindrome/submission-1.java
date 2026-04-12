class Solution {
    public boolean isPalindrome(String s) {
        //two pointer
        int startIdx = 0;
        int endIdx = s.length() -1;
        
        while(startIdx < endIdx){
            char firstChar = s.charAt(startIdx);
            char lastChar = s.charAt(endIdx);

            while(!Character.isLetterOrDigit(firstChar) && startIdx < endIdx){
                startIdx++;
                firstChar = s.charAt(startIdx);
            }

            while(!Character.isLetterOrDigit(lastChar) && startIdx < endIdx){
                endIdx--;
                lastChar = s.charAt(endIdx);
            }

            if(Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)){
                return false;
            }

            startIdx++;
            endIdx--;
        }

        return true;
    }
}
