
class Solution {

    public int removeElement(int[] num, int val) {

        int i=0;
        int j=num.length-1;
        
        while(i<=j){

            if(num[i]==val&&num[j]!=val) num[i++]=num[j--]; 
            else if(num[i]!=val) i++;
            else if(num[j]==val) j--; 
        }
        return j+1;
    }
}