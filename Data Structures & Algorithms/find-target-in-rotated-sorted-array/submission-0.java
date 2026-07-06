class Solution {
    public int search(int[] nums, int target) {
        int n=-1;
        for (int i =0;i<nums.length;i++){
            if(target==nums[i]){
                n=i;
               break;
            }
        }
        return n;
    }
}
