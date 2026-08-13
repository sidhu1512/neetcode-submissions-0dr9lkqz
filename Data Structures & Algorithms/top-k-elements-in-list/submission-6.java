class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n:nums) freq.put(n, freq.getOrDefault(n, 0) +1);

        List<List<Integer>> topK = new ArrayList<>();
        for(int i=0; i<=nums.length; i++) topK.add(new ArrayList<>());
        freq.forEach((key, value) -> { topK.get(value).add(key);});
        int[] ans =  new int[k];
        int counter =0;
        for(int i=nums.length; i>=0; i--){
            for(Integer n: topK.get(i)){
                ans[counter++] = n;
                if(counter == k) return ans;
            }
        }
        return ans;
    }
}
