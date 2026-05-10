class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr1 = new int[26];
        for (Character c : s.toCharArray()){
            arr1[c - 'a']++;
        }

        int[] arr2 = new int[26];
        for (Character c : t.toCharArray()){
            arr2[c - 'a']++;
        }
        
        return Arrays.equals(arr1, arr2);
    }
}
