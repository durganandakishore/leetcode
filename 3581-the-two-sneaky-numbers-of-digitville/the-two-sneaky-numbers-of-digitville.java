class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                list.add(nums[i]);
                i = i+1;
            }
        }
        int[] arr = new int[list.size()];
        int idx = 0;
        for(int i : list){
            arr[idx++] = i;
        }
        return arr;
    }
}