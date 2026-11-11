class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
                int j=n-1;
                pivot=i;
                while(j>i){
                    if(nums[j]>nums[i]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;
                    }
                    j--;
                }
                break;
            }
        }
        int left = pivot + 1;
int right = nums.length - 1;

while (left < right) {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;

    left++;
    right--;
}

    }
}
/* 
// u removed u went 1 2 3 and removed 3 and 2 and then u start from 0 again find 

 4 5 1 2 3 
 
 1 2 3 4 5 

1 2 3 5 4 

1 2 4 3 5
1 2 4 5 3 
1 2 5 3 4 
1 2 5 4 3 
1 3 5 4 2 


1 2 3 
1 3 2 
2 1 3 
2 3 1 
3 1 2 
3 2 1 
*/