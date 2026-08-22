class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int number=n;
        int mul=1;
        while(number>0){
            int digit=number%10;
            sum+=digit;;
            mul*=digit;
            number/=10;
        }
          return n%(sum+mul)==0;
            
    }
}