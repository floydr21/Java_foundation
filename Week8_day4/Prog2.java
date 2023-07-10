// single linked list 
class Node {
  int data;
  Node next;

  public Node(int data){
    this.data=data;
    this.next=null;
  }
}
class LinkedList {
  Node head;
  public void add(int data){
    Node newNode=new Node(data);
    if(head==null){
      head=newNode;
    }
    else {
      Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
      
    }
      temp.next=newNode;
    }
  }
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.println(temp.data+" ");
      temp=temp.next;
    }
  }
}
public class Prog2 {
  public static void main(String[] args){
    LinkedList list=new LinkedList();
    list.add(10);
    list.add(15);
    list.add(20);
    list.display();
  }
}