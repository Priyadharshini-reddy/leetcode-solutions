class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s=new Stack<>();
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);

        for(int i=0;i< 2*nums.length;i++){

            int index=i%n;
            while(!s.isEmpty() && nums[index]>nums[s.peek()]){
                arr[s.pop()]=nums[index];
            }

            if(i<n){
                s.push(index);
            }

        }
        return arr;
    }
}
/**

'implent detail'
traversing 2nd time then 
 1 2 1

 2 1 


push new 
pop old and store 2 in -popped index 

 */