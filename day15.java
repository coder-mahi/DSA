// https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] arr) {
      int left = 0;
      int right = arr.length-1;
      int maxArea = 0; 
      while(left<right){
        int currentArea = Math.min(arr[left],arr[right]) * (right-left);
        maxArea = Math.max(maxArea,currentArea);
        if(arr[left]<arr[right]){
            left++;
        }else{
            right--;
        }
      }
      return maxArea;
    }
}

// apna clg sheet
class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int trappedWater = 0;
        
        while (left < right) {
            if (height[left] < height[right]) {
                // Update leftMax and calculate trapped water on the left side
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trappedWater += leftMax - height[left];
                }
                left++;
            } else {
                // Update rightMax and calculate trapped water on the right side
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trappedWater += rightMax - height[right];
                }
                right--;
            }
        }
        
        return trappedWater;
    }
}
