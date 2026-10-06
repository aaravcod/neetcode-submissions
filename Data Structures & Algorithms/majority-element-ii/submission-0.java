
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer,Integer> freqmap = new HashMap<>();
        for (int num:nums){
            freqmap.put(num,freqmap.getOrDefault(num, 0)+1);  
        }
        int arrlength=(int) nums.length/3;
        List<Integer> array=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            if (entry.getValue() > arrlength) {
                array.add(entry.getKey());
            }
        }
        return array;
    }
}