class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n:nums) freq.put(n, freq.getOrDefault(n, 0) +1);

        // List<Integer> list = new ArrayList<>(freq.keySet());
        // list.sort((a,b) -> freq.get(b) - freq.get(a));

        // int[] topK = new int [k];
        // for(int i=0; i<k; i++) topK[i] = list.get(i);
        // return topK;
        return freq.keySet().stream()
                            .sorted((a,b) -> freq.get(b) - freq.get(a))
                            .limit(k)
                            .mapToInt(i -> i)
                            .toArray();
    }
}
