package hackerrank;
import java.io.*;
import java.util.*;

public class Day24 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        myNodes head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);

    }

    public static myNodes removeDuplicates(myNodes head) {
        //Write your code here
        if(head == null || head.next == null){
            return head;
        }
        if(head.data == head.next.data){
            head.next = head.next.next;
            removeDuplicates(head);
        }else{
            removeDuplicates(head.next);
        }
        return head;

    }

    public static  myNodes insert(myNodes head,int data){
        myNodes p=new myNodes(data);
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else{
            myNodes start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }

    public static void display(myNodes head){
        myNodes start=head;
        while(start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
}

class myNodes{
    int data;
    myNodes next;
    myNodes(int d){
        data=d;
        next=null;
    }

}