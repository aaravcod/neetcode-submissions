class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        
        for(int i=0;i<output.length;i++){
            int curr=i;
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(curr==j){
                    continue;
                }
                prod=prod*nums[j];

            }
            output[i]=prod;
        }
        return output;
        
    }
}  
