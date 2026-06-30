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
    node insertNode(int data,int pos)
    {
        if(head==null)
        {
            return null;
        }
        node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        node newNode=temp.next;
        temp.next=null;
       node x=new node(data);
       temp.next=x;
       temp.prev=x;
       x.next=newNode;
       newNode.prev=x;
        return head;
    }
}
public class inerstatpos {
    public static void main(String[] args) {
        doubly_LL ll = new doubly_LL();
        ll.addToTail(10);
        ll.addToTail(20);
        ll.addToTail(30);
        ll.addToTail(40);
        ll.addToTail(50);
        ll.display();
        ll.head=ll.insertNode(100, 3);
        ll.display();
    }
}
