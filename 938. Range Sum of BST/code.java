class Solution {
    int l;
    int h;
    ArrayList<Integer> arr=new ArrayList<Integer>();
    void creatingArray(TreeNode root){
        if(root==null)
            return;
        else if(root.val>=l && root.val<=h)
            arr.add(root.val);
        
        creatingArray(root.left);
        creatingArray(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        l=low;
        h=high;
        creatingArray(root);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        return sum;
        
   