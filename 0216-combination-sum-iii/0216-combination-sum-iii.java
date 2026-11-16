class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> curr=new ArrayList<>();
        int nums[]={1,2,3,4,5,6,7,8,9};
         List<List<Integer>> result = new ArrayList<>();
        add(curr, result, nums, k, n, 0);

        return result;

    }
    void add(List<Integer>curr,List<List<Integer>> result,int nums[],int k,int n,int start){
        int sum=0;
        if(n==0 && curr.size()==k){
           result.add(new ArrayList<>(curr));
           return;
        }
       if(n<0){
        return;
       }
       for(int i=start;i<nums.length;i++){
          curr.add(nums[i]);
          add(curr,result,nums,k,n-nums[i],i+1);
         curr.remove(curr.size()-1);
       
       }


    }
}
/**

1 2 3 9

3 to get 7 
1 2 3  




 */