class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer n: nums){
            set.add(n);
        }

        int max =0;
        
        for(Integer n: set){
           if(set.contains(n-1)) continue;
           int val = n+1;
            int temp = 1;
           while(set.contains(val)){      
                    val++;
                    temp++; 
           }
           max = Math.max(max, temp);
        }

        return max;
    }
}
