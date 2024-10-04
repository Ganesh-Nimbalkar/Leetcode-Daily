class Solution {
    public void rotate(int[] nums, int k) {
        int s=nums.length;
        k=k % s;
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[(i+k)%s]=nums[i];
        }
        for(int i=0;i<s;i++){
            nums[i]=arr[i];
        }
    }
}