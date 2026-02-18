class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int k  = 0;
        int[] arr = new int[nums.length];
        while(i < n){
            arr[k] = nums[i];
            arr[k+1] = nums[j];
            i++;
            j++;
            k += 2;
        }
        return arr;
    }
}