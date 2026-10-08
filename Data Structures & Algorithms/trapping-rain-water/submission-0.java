class Solution {
    public int trap(int[] height) {
        int left=height[0];
        int length= height.length;
        int right=height[length-1];
        int max_area=0;
        while (left>right){
            int area=left*right;
            if (area>max_area){max_area=area;}
            if (left>right){right--;}
            else{left++;}

        }
        return max_area;
    }
}
