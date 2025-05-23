public class insertAtHead{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                insertAtEnd(val);
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertAtHead(4);
        ll.insertAtHead(5);
        ll.display();
    }
}