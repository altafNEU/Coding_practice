class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rsum = 0, max =0;
        for(int i =0;i <nums.length; i++){
            if(nums[i] == 0)
                rsum --;
            else rsum ++;
            if(map.containsKey(rsum)){
                int n = i - map.get(rsum);
                max = Math.max(max, n);
            }else map.put(rsum, i);
        }
        return max;


    }
}