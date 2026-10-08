
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing=0;
        for(int i=0;i<nums.length;i++){
            if (i==nums.length-1){
                missing=nums[i]+1;
                break;
            }
            if (nums[i]==nums[i+1]){continue;}

            if (nums[i]+1!=nums[i+1]){
                missing=nums[i]+1;
                break;
            }
            if (missing==0){continue;}
        }
        return missing;
    }
}