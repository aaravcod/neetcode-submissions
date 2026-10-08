class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(nums.length==0){return 0;}
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        int longestConsecutivecount=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){continue;}
            if(nums[i]==nums[i-1]+1){
                longestConsecutivecount+=1;
            }
            
        }
        return longestConsecutivecount;
    }
}
