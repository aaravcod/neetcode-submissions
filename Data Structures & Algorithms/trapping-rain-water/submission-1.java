class Solution {
    public int trap(int[] height) {
        int left=0;
        int length= height.length;
        int right=length-1;
        int max_area=0;
        while (left<right){
            int area=height[left]*height[right];
            if (area>max_area){max_area=area;}
            if (height[left]>height[right]){right--;}
            else{left++;}

        }
        return max_area;
    }
}
