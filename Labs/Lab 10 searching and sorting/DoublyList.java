class DoublyList{
  Node2 head;
  DoublyList(int []array){
    head=makeList(null,null,array,0);
  }
  
  Node2 makeList(Node2 n,Node2 p,int []array, int i){
    if(i>=array.length)
      return null;
    n=new Node2(array[i],p,null);
    n.next=makeList(n.next,n,array,i+1);
    return n;
  }
  
  void printList(Node2 n){
    if(n!=null){
      System.out.print(n.val+" ");
      printList(n.next);
    }
  }
}