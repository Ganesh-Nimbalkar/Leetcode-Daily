class Solution {
    public void moveZeroes(int[] nums) {
       int temp;
       for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==0 && nums[j]!=0){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
       } 
    }
}