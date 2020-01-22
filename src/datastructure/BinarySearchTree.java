package datastructure;

import java.util.Scanner;

public class BinarySearchTree {
    class Node
    {
        int key;
        Node left;
        Node right;
        Node(int data)
        {
            key=data;
            left = null;
            right = null;
        }

    }
    Node root;
    BinarySearchTree()
    {
        root =null;
    }
    void insert(int key)
    {
        root = insertRec(root,key);
    }
    Node insertRec(Node root , int key)
    {
        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        if(key<root.key)
        {
            root.left = insertRec(root.left,key);
        }
        if(key>root.key)
        {
            root.right = insertRec(root.right,key);
        }
        return root;
    }
    public Node search(Node root,int key)
    {
        if(root==null || root.key  == key)
            return root;
        if(root.key>key)
            return search(root.left,key);
        return search(root.right,key);
    }
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if(root!=null)
        {
            inorderRec(root.left);
            System.out.println(root.key+" ");
            inorderRec(root.right);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(50);
        bt.insert(30);
        bt.insert(20);
        bt.insert(40);
        bt.insert(70);
        bt.insert(60);
        bt.insert(80);
        bt.inorder();
        System.out.println(bt.search(bt.root,50).key);
    }

}
