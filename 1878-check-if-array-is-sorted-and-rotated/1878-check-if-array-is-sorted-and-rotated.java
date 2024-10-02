class Solution {
    public boolean check(int[] nums) {
        int j=0,count=0;
        int n=nums.length;
		 for(int i=0;i<n-1;i++) {
			 if(nums[i]>nums[(i+1)%n]) {
				 count++;
			 }
		 }
		 if(count>0 && nums[j]>nums[n-1] && count<2) {
			 return true;
		 }else if(count>1){
	            return false;
		 }
		 else if(count>0 && nums[0]<nums[n-1]){
			 return false;
		 }else {
			 return true;
		 }
    }
}