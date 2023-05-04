public class Node{
  Patient patient;
  Node next;
  Node prev;
  Node(Patient pat, Node n, Node p){
    patient=pat;
    next=n;
    prev=p;
  }
}