/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root=construct(nums,0,nums.length-1);
        return root;
    }
    
    public TreeNode construct(int arr[], int s, int e){
        if(s>e) return null;
        if(s==e) return new TreeNode(arr[s]);
        int index=maxInArray(arr,s,e);
        TreeNode root=new TreeNode(arr[index]);
        root.left=construct(arr,s,index-1);                                         
        root.right=construct(arr,index+1,e);
        return root;
    }
    public int maxInArray(int arr[],int s,int e){
        int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=s;i<=e;i++){
            if(max<arr[i]){
                max=arr[i];
                ind=i;
            }
        }
            
        return ind;
    }
    
}