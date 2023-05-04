public class LinkedList{
  Node head;
  LinkedList(int []array){
    head=makeList(array,0);
  }
  Node makeList(int []array,int n){
    if(n>=array.length)
      return null;
    return new Node(array[n],makeList(array,n+1));
  }
}