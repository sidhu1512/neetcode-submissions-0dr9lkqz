class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map =  new TreeMap<>();

        for(Integer n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];

        for(int i=0; i<freq.length; i++){
            freq[i] =  new ArrayList<>();
        }

        for(Integer n : map.keySet()){
            freq[map.get(n)].add(n);
        }

        int[] res = new int[k];
        int indx = 0;

        for(int i = freq.length -1; i > 0; i--){
            for(int n : freq[i]){
                res[indx++] = n;

                if(indx == k) return res;
            }
        }

        return res;
    }
}
