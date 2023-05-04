public class Node{
  Object element;
  Node left;
  Node right;
  Node parent;
  Node(Object e, Node l, Node r){
    element=e;
    left=l;
    right=r;
  }
  Node(Object e, Node l, Node r, Node p){
    element=e;
    left=l;
    right=r;
    parent=p;
  }
}