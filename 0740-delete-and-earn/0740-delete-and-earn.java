class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int max=nums[0];
        for(int num:nums){
            max=Math.max(num,max);
        }
        int [] points=new int[max+1];
        for(int num:nums){
            points[num]+=num;
        }
        int prev1=0;
        int prev2=0;
        int curr=0;
        for(int i=0;i<points.length;i++){
            curr=Math.max(prev1,prev2+points[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
























