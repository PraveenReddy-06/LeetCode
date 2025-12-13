void sortColors(int* nums, int numsSize) {
    for(int i = 1; i < numsSize; i++) {
        int j = i;
        int temp = nums[i];
        while(j>0&& nums[j-1]> temp) {
            nums[j] = nums[j-1];
            j--;
        }
        nums[j] = temp;
    }
}