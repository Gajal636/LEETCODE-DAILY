class Solution {
    public int calPoints(String[] operations) {
            List<Integer> list=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            // int a=Integer.parseInt(operations[i]);
            // if(operations[i]==a){
            //     list.add(operations[i]);
            if(operations[i].equals("C")){
                int last=list.size()-1;
                list.remove(last);
            }else if(operations[i].equals("D")){
                int num=list.get(list.size()-1);
                int mul=num*2;
                list.add( mul);
            }else if(operations[i].equals("+")){
                int last=list.get(list.size()-1);
                int last2=list.get(list.size()-2);
                int newScore=last+last2;
                list.add(newScore);
            }else{
                int a=Integer.parseInt(operations[i]);
                list.add(a);
            }
        }
        int sum=0;
        for(int num:list){
               sum+=num;
        }
        return sum;
    }
}