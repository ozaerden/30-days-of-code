package hackerrank;
import java.util.*;

public class Day22 {
    public static int getHeight(Nodes root){
        int leftcount=0;
        int rightcount=0;
        if(root==null){
            return 0;
        }
        else{
            if(root.left!=null){

                leftcount=getHeight(root.left)+1;

            }
            if(root.right!=null){
                rightcount=getHeight(root.right)+1;

            }
            return Math.max(leftcount,rightcount);
        }

    }

    public static Nodes insert(Nodes root,int data){
        if(root==null){
            return new Nodes(data);
        }
        else{
            Nodes cur;
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Nodes root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

class Nodes{
    Nodes left,right;
    int data;
    Nodes(int data){
        this.data=data;
        left=right=null;
    }
}