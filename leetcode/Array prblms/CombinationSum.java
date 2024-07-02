import java.util.*;
class combinationSum {
    public  void main(String[] args) {
        int[]candidates={2,3,5};
        int target=8;
        System.out.println(combinationSum1(candidates,target));
    }
    public  List<List<Integer>> combinationSum1(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        List<Integer> ds=new ArrayList<>();
        recursion(0,target,candidates,ds,res);
        return res;

        
    }
    private void recursion(int start,int target,int [] candidates,List<Integer>ds,List<List<Integer>>res){
        if(start==candidates.length){
            if(target==0){
                res.add(new ArrayList<>(ds));
            }
            return;

        }
        if(candidates[start]<=target){
            ds.add(candidates[start]);
            recursion(start,target-candidates[start],candidates,ds,res);
            ds.remove(ds.size()-1);
        }
        recursion(start+1,target,candidates,ds,res);
    }
}