class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> arr= new ArrayList<>();
        int a;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]>prices[i]){
                    a=prices[j]-prices[i];
                    arr.add(a);
                }
            }
        }
        if(arr.size()>0){
            Collections.sort(arr);
            return arr.get(arr.size()-1);
        }
        else{
            return 0;
        }
    }
}
