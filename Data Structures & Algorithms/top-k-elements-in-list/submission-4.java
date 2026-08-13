class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n:nums) freq.put(n, freq.getOrDefault(n, 0) +1);
        List<int[]> list = new ArrayList<>();
        freq.forEach( (key,value) -> { list.add(new int[]{key, value}); });
        Collections.sort(list, (a,b) -> b[1] -a[1]);
        int[] topK = new int [k];
        while(k >0) {
            topK[k-1] = list.get(k-1)[0];
            k--;}
        return topK;
    }
}
