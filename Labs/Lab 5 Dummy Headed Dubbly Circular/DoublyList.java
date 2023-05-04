public class DoublyList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head=new Node(null,null,null);
    Node tail=head;
    for(int i=0;i<a.length;i++){
      Node n=new Node(a[i],null,null);
      tail.next=n;
      n.prev=tail;
      tail=tail.next;
    }
    head.prev=tail;
    tail.next=head;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count = 0;
    for(Node n=head.next;n!=head;n=n.next)
      count++;
    return count;
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for(Node n=head.next;n!=head.prev;n=n.next)
      System.out.print(n.element+", ");
    System.out.println(head.prev.element);
  }
  
  public void backwardprint(){
    for(Node n=head.prev; n!=head.next ;n=n.prev){
      System.out.print(n.element+", ");
    }
    System.out.println(head.next.element);
  }
  
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    if(idx<0 || idx>countNode()-1)
      return null;
    Node n=head.next;
    for(int i=0;i<idx;i++)
      n=n.next;
    return n;
  }
  
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count=0;
    int i=0;
    for(Node n=head.next;n!=head;n=n.next){
      if(n.element==elem){
        count++;
        break;
      }
      i++;
    }
    if(count!=0)
      return i;
    return -1;
  }
  
  
  
  
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if(idx>=0 && idx<=countNode()){
      Node n=new Node(elem,null,null);
      Node p,s;
      if(idx==0)
        p=head;
      else
        p=nodeAt(idx-1);
      s=p.next;
      n.next=s;
      n.prev=p;
      p.next=n;
      s.prev=n;
      
    }
  }
  
  
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int idx){
    if(idx<0 || idx>countNode()-1)
      return null;
    Node n=nodeAt(idx);
    Object k=n.element;
    Node p=n.prev;
    Node s=n.next;
    s.prev=p;
    p.next=s;
    return k;
  }
  
  
  
}