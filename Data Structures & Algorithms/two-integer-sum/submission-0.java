class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for(int i=0;i<n;i++) {
            numMap.put(nums[i], i);
        }

        for(int i=0;i<n;i++) {
            int compliment = target - nums[i];

            if(numMap.containsKey(compliment) && numMap.get(compliment) !=i) {
               return new int[]{i,numMap.get(compliment)}; 
            }
        }
    return new int[]{};

    }
}
