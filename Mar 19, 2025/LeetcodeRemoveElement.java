class LeetcodeRemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        for(int i=nums.length-count;i<nums.length;i++){
            nums[i]=0;
        }
        return nums.length-count;
    }
}