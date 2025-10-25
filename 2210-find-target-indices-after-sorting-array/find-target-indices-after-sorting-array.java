class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ArrayList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                ArrayList.add(i);
            }
        }
        return ArrayList;
    }
}