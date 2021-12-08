package hackerrank;
import java.util.*;
import java.io.*;

public class Day23 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        myNode root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }

    static void levelOrder(myNode root){
        Queue<myNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            myNode current = queue.remove();
            System.out.print(current.data+" ");
            if (current.left!=null) queue.add(current.left);
            if (current.right!=null) queue.add(current.right);
        }
    }

    public static myNode insert(myNode root,int data){
        if(root==null){
            return new myNode(data);
        }
        else{
            myNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
}

class myNode{
    myNode left,right;
    int data;
    myNode(int data){
        this.data=data;
        left=right=null;
    }
}