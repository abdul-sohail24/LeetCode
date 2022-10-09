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
class Solution 
{
    //Recursion
    public boolean findTarget(TreeNode root, int k) 
    {
        boolean ans = traverse(root, root, k);
        return ans;
    }
    
    //Traversing in a BST
    public boolean traverse(TreeNode node, TreeNode currNode, int target)
    {       
        if(currNode == null)
            return false;
        
        if(search(node, currNode, target - currNode.val))
            return true;
        
        return traverse(node, currNode.left, target) || traverse(node, currNode.right, target);  
    }
    
    //Searching in a BST
    public boolean search(TreeNode node, TreeNode currNode, int find_num)
    {
        if(node == null)
            return false;
        else if(find_num > node.val)
            return search(node.right, currNode, find_num);
        else if(find_num < node.val)
            return search(node.left, currNode, find_num);
        else if(find_num == node.val)
            return currNode != node;
        else
            return false;
    }
}