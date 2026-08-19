class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int v=x;
        while(x!=0){
            int digit=x%10;
            x=x/10;
            sum+=digit;
       }
       if(v%sum==0) return sum;
       else return -1;
     
    }
}