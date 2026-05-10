class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map =  new TreeMap<>();

        for(Integer n: nums) {
            map.put(n, map.getOrDefault(n, 1) + 1);
            // map.computeIfAbsent(n, 1) + 1;
        }

        PriorityQueue<Integer> queue = new PriorityQueue((a, b) -> map.get(b) - map.get(a));

        queue.addAll(map.keySet());

        int[] ans = new int[k];
        
        for(int i=0; i< k; i++){
            ans[i] = queue.poll();
        }

        return ans;
    }
}
