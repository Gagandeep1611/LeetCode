package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=generate(rowIndex);
        return list.get(rowIndex-1);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> prevList=null;
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if((j-1)==-1 || j==i){
                    temp.add(1);
                }else{
                    temp.add(prevList.get(j - 1) + prevList.get(j));
                }
            }
            list.add(temp);
            prevList=temp;

        }
        return list;
    }

    public static void main(String[] args) {
        PascalsTriangle triangle=new PascalsTriangle();
        System.out.println(triangle.generate(5));
    }
}
