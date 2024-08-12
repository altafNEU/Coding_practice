class Solution {
    public int subarraySum(int[] nums, int k) {
        int rsum = 0,count=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        //(rsum-k == map.containsKey)?  count += map.get(rsum-k)
        for(int i =0; i < nums.length; i++){
            rsum += nums[i];

            if(map.containsKey(rsum - k)){
                count += map.get(rsum-k);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum, 1);
            }else{
                map.put(rsum, map.get(rsum)+1);
            }
            
        }

        return count;
    }
}