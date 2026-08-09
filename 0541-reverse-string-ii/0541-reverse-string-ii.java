class Solution {
    public String reverseStr(String s, int k) {
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i+=2*k){
            int m=i;
            int j=Math.min(m+k-1,a.length-1);
            while(m<j){
                char temp=a[m];
                a[m++]=a[j];
                a[j--]=temp;
            }
        }
        return new String(a);
    }
}