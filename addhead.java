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
    void addToHead(int val)
    {
        node temp=new node(val);
        if(head==null)
        {
            head=tail=temp;
        }
        else
        {
            temp.next=head;
            head.prev=temp;
            head=temp;
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
            System.out.println("Null\n");
        }
    }
}
public class addhead {
    public static void main(String[] args) {
        doubly_LL ll = new doubly_LL();
        ll.addToHead(1);
        ll.addToHead(2);
        ll.addToHead(3);
        ll.addToHead(4);
        ll.addToHead(5);
        ll.display();
    }
}
