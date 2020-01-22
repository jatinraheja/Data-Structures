package datastructure;

import java.util.LinkedList;
import java.util.Queue;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int d)
    {
        data = d;
        next = null;
    }
}
class BinaryTreeNode
{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int d)
    {
        data = d;
        left = null;
        right =null;
    }
}
public class CompleteBinaryTree {
    ListNode head;
    BinaryTreeNode root;
    void push(int new_data)
    {
        ListNode new_node = new ListNode(new_data);
        new_node.next = head;
        head = new_node;
    }
    BinaryTreeNode ConvertList2Binary(BinaryTreeNode node)
    {
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
            if(head == null)
            {
                node = null;
                return null;
            }
            node = new BinaryTreeNode(head.data);
            q.add(node);
            head = head.next;
            while (head != null)
            {
                BinaryTreeNode leftchild = null , rightchild = null;
                BinaryTreeNode parent = q.peek();
                BinaryTreeNode pp = q.poll();
                leftchild = new BinaryTreeNode(head.data);
                q.add(leftchild);
                head = head.next;
                if(head != null)
                {
                    rightchild = new BinaryTreeNode(head.data);
                    q.add(rightchild);
                    head = head.next;
                }
                parent.left = leftchild;
                parent.right = rightchild;
            }
            return node;
    }
    void inorderTraversal(BinaryTreeNode node)
    {
        if(node != null)
        {
            inorderTraversal(node.left);
            System.out.println(node.data+" ");
            inorderTraversal(node.right);
        }
    }
    public static void main(String args[])
    {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.push(36);
        tree.push(30);
        tree.push(25);
        tree.push(15);
        tree.push(12);
        tree.push(10);
        BinaryTreeNode node = tree.ConvertList2Binary(tree.root);
        System.out.println("Inorder traversal of the" + " Constructed Binary tree is");
        tree.inorderTraversal(node);
    }
}
