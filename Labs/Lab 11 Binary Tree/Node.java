public class Node{
  Object object;
  Node parent;
  Node left;
  Node right;
  
  Node(Object o, Node p, Node l, Node r){
    object = o;
    parent=p;
    left =l;
    right=r;
  }
}