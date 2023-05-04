public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=tail.next;
    }
  }
  
  
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    for(Node n=head;n!=null;n=n.next)
      count++;
    return count;
  }
  
  /* prints the elements in the list */
  public void printList(){
    System.out.print(head.element);
    for(Node n=head.next;n!=null;n=n.next)
      System.out.print(", "+n.element);
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    if(idx<0 || idx>countNode()-1)
      return null;
    Node result=head;
    for(int i=0;i<idx;i++){
      result=result.next;
    }
    return result;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    if(idx<0 || idx>countNode()-1)
      return null;
    Node n=head;
    for(int i=0;i<idx;i++,n=n.next){}
    return n.element;
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    if(idx<0 || idx>countNode()-1)
      return null;
    Node n=head;
    for(int i=0;i<idx;i++,n=n.next){}
    Object e=n.element;
    n.element=elem;
    return e;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count=0;
    for(Node n=head;n!=null;n=n.next,count++){
      if(n.element==elem){
        return count;
      }
    }
    return -1;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    for(Node n=head;n!=null;n=n.next){
      if(n.element==elem){
        return true;
      }
    }
    return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node head2=new Node(head.element,null);
    Node tail2=head2;
    for(Node tail=head.next;tail!=null;tail=tail.next){
      Node n=new Node(tail.element,null);
      tail2.next=n;
      tail2=tail2.next;
    }
    return head2;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node n=new Node(head.element,null);
    for(Node tail=head.next;tail!=null;tail=tail.next){
      n=new Node(tail.element,n);
    }
    return n;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    if(idx==0)
      head=new Node(elem,head);
    else if(idx>0 && idx<=countNode()){
      Node n=new Node(elem,null);
      if(idx!=countNode())
        n.next=nodeAt(idx);
      nodeAt(idx-1).next=n;
    } else
      System.out.println("Invalid index");
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    if(index<0 && index>countNode()-1)
      return null;
    else{
      Object x=get(index);
      if(index==0)
        head=head.next;
      else
        nodeAt(index-1).next=nodeAt(index).next;
      return x;
    }
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    insert(head.element,countNode());
    head=head.next;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    insert(nodeAt(countNode()-1).element,0);
    remove(countNode()-1);
  }
}