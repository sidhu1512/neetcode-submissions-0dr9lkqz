class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs){
            int[] temp = new int[26];
            for(Character c: s.toCharArray()){
                temp[c - 'a']++;
            }

            String key = Arrays.toString(temp);

            // if(map.containsKey(key)){
            //     List<String> list = map.get(key);
            //     list.add(s);

            //     map.put(key, list);
            // }else {
            //     map.put(key, new ArrayList<>(Arrays.asList(s)));
            // } 

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        
        }
        return new ArrayList<>(map.values());
        
    }
}
