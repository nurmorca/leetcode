int searchInsert(int* nums, int numsSize, int target) {
    int i = 0, notfound = 1;
    
    int output = 0;
    
    while(i < numsSize && notfound){
        if(nums[i] < target)
            i++;
        else{
        notfound = 0;
         }
    }   
    
    return i;
}