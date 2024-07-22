class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length -1;
        while(low <= high){
            if(nums[low] < nums[high])
                return nums[low];

            int mid = low + (high - low)/2;
            
            if((mid == 0 || nums[mid-1] > nums[mid] ) 
                && (mid == nums.length-1 || nums[mid] < nums[mid+ 1]))
                    return nums[mid];
            //now finding unsorted side... why? because in unsorted only the min will exist
             if(nums[mid] < nums[high])
                high = mid -1;
            //else if(nums[mid] > nums[low])
              else  low = mid + 1;
        }
        return +9000;
    }
}