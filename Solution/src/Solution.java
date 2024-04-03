import java.util.ArrayList;
import java.util.List;

// 1 1 1 1 1
// 1 2 3 4
// 1 3 6
// 1 4
// 1
class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i<numRows; ++i){
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < i; ++j){
                if (j == 0||j == 1) {
                    row.add(1);
                }
                else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        };
        return ret;
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}