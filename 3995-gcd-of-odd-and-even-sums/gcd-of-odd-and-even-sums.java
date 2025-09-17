class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;
        int nums = n*2;
        for(int i=1;i<=nums;i++){
            if(i%2==0){
                evensum += i;
            }else{
                oddsum += i;
            }
        }int max = 0;
        for(int i =1;i<=n; i++){
            if(evensum%i==0 && oddsum%i ==0){
                if(i>max){
                    max=i;
                }
            }
        }return max;
    }
}