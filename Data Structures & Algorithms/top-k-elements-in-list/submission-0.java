

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int val=1;
        
        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);                
            }
            else{
                map.put(nums[i], val);
            }
        }
        
        ArrayList<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((a, b) -> b.getValue() - a.getValue());

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(sortedList.get(i).getKey());
        }
        int[] arr=new int[k];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
        

    }
}
