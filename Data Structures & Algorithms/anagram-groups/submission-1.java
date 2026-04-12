class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            map.computeIfAbsent(getArray(s), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public String getArray(String str){
        int[] arr = new int[26];
        for(char c : str.toCharArray()){
            arr[ c - 'a']++;
        }
        return Arrays.toString(arr);
    }
}
