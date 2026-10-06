

class Solution {
        public void rotate(int[] nums, int k) {
            Deque<Integer> queue = new ArrayDeque<>();
            for (int i : nums) {
                queue.add(i);
            }
            for (int i = 0; i < k; i++) {
                int data = queue.pollLast();
                queue.addFirst(data);
            }
            int index = 0;
            for (int val : queue) {
                nums[index++] = val;
            }
        }
    }
