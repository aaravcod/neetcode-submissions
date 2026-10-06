

class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> freqmap = new HashMap<>();
        for (int num:nums){
            freqmap.put(num,freqmap.getOrDefault(num, 0)+1);  
        }
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}