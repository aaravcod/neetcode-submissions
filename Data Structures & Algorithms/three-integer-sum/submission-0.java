import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();


        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                }   
                else if(sum<0){j++;}
                else{k--;}
            }
        }
       return list;
    }
}
