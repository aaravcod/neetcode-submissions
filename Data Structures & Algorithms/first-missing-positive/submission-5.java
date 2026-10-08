
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int missing=0;
        boolean allNonPositive = true;

        for (int num : nums) {
            if (num > 0) {allNonPositive = false;missing=1;return missing;}
        }   

        if (nums[0]>1){missing=1;return missing;}
        for(int i=0;i<nums.length;i++){
            if (i==nums.length-1){
                missing=nums[i]+1;
                break;
            }
            if (nums[i]==nums[i+1]){continue;}

            if (nums[i]+1!=nums[i+1]){
                missing=nums[i]+1;
                if (missing==0){continue;}
                break;
            }
            
        }
        return missing;
    }
}