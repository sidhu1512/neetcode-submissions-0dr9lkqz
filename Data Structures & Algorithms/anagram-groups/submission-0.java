class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // 

        for(int i=0; i <strs.length; i++){
            String arr = getArray(strs[i]);

            if(map.containsKey(arr)){
                List<String> temp = map.get(arr);
                temp.add(strs[i]);
                map.put(arr, temp);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(arr, list);
            }
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
