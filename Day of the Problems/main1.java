public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertFirst(value);
        }
        tail.next=node;
        tail=node;
        size+=1;

        
    }
    public void insertAtIndex(int value,int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value);
        node.next=temp.next;
        temp.next=node;

    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
public class main1 {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertFirst(23);
        list.insertLast(30);
        list.insertLast(35);
        list.insertAtIndex(25, 1);
        list.insertAtIndex(29,2);
        list.display();

        
    }
    
}
