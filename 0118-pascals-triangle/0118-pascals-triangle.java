class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        int i=0;
        while(i<numRows){
            List<Integer> row = new ArrayList<>();
                for(int j=0;j<=i;j++){
                    if(j==0||j==i)
                        row.add(1);
                    else{
                        List<Integer> temp = triangle.get(i-1);
                        row.add(temp.get(j)+temp.get(j-1));
                    }
                }
                triangle.add(row);
                i++;
            }
        return triangle;
    }
}