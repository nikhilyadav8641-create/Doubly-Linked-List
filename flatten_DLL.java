class node{
    int val;
    node next;
    node prev;
}
class doubly_LL{
    node head;
    node tail;
    void addToTail(int val)
    {
        node temp=new node();
        if(head==null)
        {
            head=tail=temp;
        }
        else
        {
            tail.next=temp;
            temp.prev=temp;
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
                System.out.println(temp.val + " <--> ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    node flatten(node h1,node h2,node h3)
}
public class flatten_DLL {
    
}
