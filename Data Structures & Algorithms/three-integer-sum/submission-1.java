class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Set<String> set = new HashSet<>();


        for(int i = 0; i<n -2; i++){

            int iv = nums[i];

            for(int j = i+1; j < n-1; j++){
                int jv = nums[j];
                for(int k = j+1; k < n; k++){
                    int kv = nums[k];

                    if(iv + jv + kv == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(iv);
                        temp.add(jv);
                        temp.add(kv);

                        Collections.sort(temp);

                        String key = temp.toString();
                        if(set.contains(key)){
                            continue;
                        }else {
                            set.add(key);
                            res.add(temp);
                        }

                        
                    }
                }
                
            }
        }

        return res;
    }
}
