class Solution {
    public int differenceOfSums(int n, int m) {
        int divCount=0;
        int Non_divCount=0;
        for(int i=1;i<=n;i++){
            if(i%m!=0){
            Non_divCount+=i;
            }
            else{
                divCount+=i;
            }
        }
        return Non_divCount-divCount;
    }
}