class node{
    int val;
    node next;
    node prev;
    node(int val)
    {
        this.val=val;
    }
}
class doubly_LL{
    node head;
    node tail;
    void addToTail(int val)
    {
        node temp=new node(val);
        if(head==null)
        {
            head=tail=temp;
        }
        else
        {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }
    void display()
    {
        node temp=head;
        if(head==null)
        {
            return;
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.val + "<-->");
                temp=temp.next;
            }
            System.out.println();
        }
    }
   node reverse(node head)
    {
        node curr=head;
        node next=null;
        node p=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=p;
            curr.prev=next;
            p=curr;
            curr=next;
        }
        return p;
    }
}
public class reverse_DLL {
    public static void main(String[] args) {
        doubly_LL dd=new doubly_LL();
        dd.addToTail(10);
        dd.addToTail(20);
        dd.addToTail(30);
        dd.addToTail(40);
        dd.addToTail(50);
        dd.addToTail(60);
        dd.addToTail(70);
        dd.display();
        System.out.println("Doubly Linked after reversal -->");
        dd.head=dd.reverse(dd.head);
        dd.display();

    }
}
