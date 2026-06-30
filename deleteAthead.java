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
        node temp = new node(val);
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
        }
        System.out.println("Null");
    }
    void displayrev()
    {
        node temp=tail;
        // if(head==null)
        // {
        //     return;
        // }
        // else
        {
            while(temp!=null)
            {
                System.out.print(temp.val + "<-->");
            temp=temp.prev;
            }
        }
        System.out.println("Null");
    }
    void deletehead()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        head=head.next;
        head.prev=null;

    }
}
public class deleteAthead {
    public static void main(String[] args) {
        doubly_LL ll = new doubly_LL();
        ll.addToTail(10);
        ll.addToTail(20);
        ll.addToTail(30);
        ll.addToTail(40);
        ll.addToTail(50);
        ll.display();
        ll.deletehead();
        ll.display();
        System.out.println();
        ll.displayrev();
    }
}
