class Solution {
    public int countDigits(int num) {
        int number=num;
        int count=0;
        while(number>0){
            int digit=number%10;
            if(num%digit==0){
             count++;
            }
            number/=10;
        }
        return count;
    }
}