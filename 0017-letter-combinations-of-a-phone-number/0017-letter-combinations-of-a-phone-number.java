class Solution {
    static void solve(String digits,String[] mapped,int index,List<String> result,StringBuilder output){
        if(index>=digits.length()){
            result.add(output.toString());
            return;
        }
        

        int number=digits.charAt(index)-'0';
        String mappedString=mapped[number];

        for(int i=0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));
            solve(digits,mapped,index+1,result,output);
            output.deleteCharAt(output.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapped={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
        List<String> result=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        solve(digits,mapped,index,result,output);
        return result;
    }
}