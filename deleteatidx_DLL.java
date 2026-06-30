class node{
    int val;
    node next;
    node prev;
    node(int val)
    {
        this.val=val;
        this.next=null;
        this.prev=null;
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
    node deletNode(node head,int element)
    {
        if(head==null)
        {
            return head;
        }
        if(head.val==element)
        {
            head=head.next;
        }
        node  temp=head;
        while(temp!=null)
        {
            if(temp.next!=null && temp.next.val==element)
            {
                temp.next=temp.next.next;
                if(temp.next!=null)
                temp.next.prev=temp;
            }
            else
            {
                temp=temp.next;
            }
        }
        return head;
    }
}
public class deleteatidx_DLL {
    public static void main(String[] args) {
        doubly_LL dd = new doubly_LL();
        dd.addToTail(10);
        dd.addToTail(20);
        dd.addToTail(30);
        dd.addToTail(40);
        dd.addToTail(50);
        dd.addToTail(60);
        dd.addToTail(70);
        dd.display();
        System.out.println("Linked list after deletion");
        dd.head=dd.deletNode(dd.head, 70);
        dd.display();
    }
}
