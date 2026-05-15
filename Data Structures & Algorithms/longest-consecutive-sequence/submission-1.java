class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        ArrayList<Integer> arr= new ArrayList<>();
        int n=nums.length;
        if(n==0){
            return 0;
        }
        for(int i=0; i<n; i++){
            arr.add(nums[i]);
        }
        int count=1;
        int longest=1;
        Collections.sort(arr);
        for(int j=0; j<n-1; j++){
            if(arr.get(j)==arr.get(j+1)){
                continue;
            }
            if(arr.get(j)+1==arr.get(j+1)){
                count+=1;
            }
            else{
                longest=Math.max(longest,count);
                count=1;
            }
        }
        longest=Math.max(longest,count);
        return longest;
    }
}
