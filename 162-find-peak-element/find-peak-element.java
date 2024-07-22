class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0 , high = nums.length -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if((mid == 0 || nums[mid-1] < nums[mid]) && 
                (mid == nums.length -1 || nums[mid+1] < nums[mid])) 
                return mid;

         // LEFT SIDE OR RIGHT SIDE PEAK
         if (mid > 0 && nums[mid] < nums[mid-1])
            high = mid -1;      //left side
        else
            low = mid + 1;   //finding peak on right
        }
        return +9000;
    }
}