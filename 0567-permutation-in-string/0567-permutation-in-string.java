class Solution {
    static boolean freqCount(int count1[],int count2[]){
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int count1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            char firstChar=s1.charAt(i);
            int firstIndex=firstChar-'a';
            count1[firstIndex]++;
        }
        int i=0;
        int windowLength=s1.length();
        int count2[]=new int[26];
        for(i=0;i<windowLength;i++){
             char chars=s2.charAt(i);
             int charIndex=chars-'a';
        count2[charIndex]++;
        }

        if(freqCount(count1,count2)==true){
            return true;
        }else{
            while(i<s2.length()){
                char charAtIndex=s2.charAt(i);
                int index=charAtIndex-'a';
                count2[index]++;

                int oldIndex=i-windowLength;
                char oldIndexChar=s2.charAt(oldIndex);
                int newIndex=oldIndexChar-'a';
                count2[newIndex]--;

                if(freqCount(count1,count2)==true){
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}