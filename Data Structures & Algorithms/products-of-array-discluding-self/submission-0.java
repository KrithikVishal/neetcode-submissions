class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix= new int[n];
        int[] sufix= new int[n];

        prefix[0]=1;
        sufix[n-1]=1;
        int temp=1;

        for(int i=1; i<n; i++){
            temp*=nums[i-1];
            prefix[i]=temp;
        }

        temp=1;
        for(int j=n-2; j>=0; j--){
            temp*=nums[j+1];
            sufix[j]=temp;
        }

        for(int k=0; k<n; k++){
            nums[k]=sufix[k]*prefix[k];
        }
        return nums;
    }
}