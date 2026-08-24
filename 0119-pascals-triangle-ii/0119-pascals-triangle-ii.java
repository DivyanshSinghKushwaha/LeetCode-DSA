class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int i,prev;
        i=0;prev=1;
        list.add(1);
        while(i<rowIndex){
            long el=(((long)(rowIndex-i)*prev)/(i+1));
            i++;
            list.add((int)el);
            prev=(int)el;
        }
        return list;
    }
}