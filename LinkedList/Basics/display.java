public class display{
    public static void display(Node head){
         Node temp=head;
         while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
         }

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;      
          }
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);    
        Node c= new Node(3);
        Node d= new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        //Using For loop
        // Node temp =a;
        // for(int i=1;i<=5;i++){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        // Node temp = a;
        // //Using While loop
        // while(temp != null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        display(a);
        System.out.println();
    }
}