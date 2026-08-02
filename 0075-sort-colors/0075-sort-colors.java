class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        // int zerocount=zero-1;
        // int onecount=zerocount+one;
        
        int j=0;
        while(j<nums.length && zero>0){
            nums[j]=0;
            zero--;
            j++;
        }
         while(j<nums.length && one>0){
            nums[j]=1;
            one--;
            j++;
        }
         while(j<nums.length && two>0){
            nums[j]=2;
            two--;
            j++;
        }
    }
}