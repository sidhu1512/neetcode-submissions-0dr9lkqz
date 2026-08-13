class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //freq array then to string as key and check in map with key and add list strs
        Map<String, List<String>> anagrams = new HashMap<>();
        for(String s:strs){
            int[] freq = new int[26];
            for(int i=0; i<s.length(); i++) freq[s.charAt(i) -'a']++;
            // anagrams.put(String.valueOf(freq), anagrams)
            anagrams.computeIfAbsent(Arrays.toString(freq), (n)-> new ArrayList<>()).add(s);
        }
        // return new ArrayList<>(anagrams.values());
        // return anagrams.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        List<List<String>> result =  new ArrayList<>();
        anagrams.forEach((key, list)-> {result.add(list);});
        return result;
    }
}
