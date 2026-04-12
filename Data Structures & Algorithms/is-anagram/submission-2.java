class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for( Character i : s.toCharArray()){
            arr1[i]++;
        }
        for( Character i : t.toCharArray()){
            arr2[i]++;
        }

        if(!Arrays.equals(arr1, arr2)) return false;

        return true;
    }
}
