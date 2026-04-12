class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
 for(int ar1 : nums){
    for(int ar2 : nums){
        if(ar1 == ar2){
            count++;
        }
    }
 }
 if(count > (nums.length + 1)){
    return true;
 }else{return false;}
    }
}
