class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        return _bs(nums, 0, nums.length-1, target);
    }
    
    int possible = -1;
    int _bs(int[] nums, int start, int end, int target) {

        if (end < start ) return possible;
        int mid = (start+end)/2;
        
        if (nums[mid] < target) return _bs(nums, mid+1, end, target);
        //trick: multiple match
        if (nums[mid] == target) possible = mid; 
        return _bs(nums, start, mid-1, target);
    }
}
